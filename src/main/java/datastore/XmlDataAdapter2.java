package datastore;

import java.io.*;
import java.util.*;
import javax.xml.bind.*;
import javax.xml.bind.annotation.*;

import customer.Customer;
import customer.Member;
import customer.VIP;

/**
 * Class to save and load data from an XML file.
 * This class uses JAXB (Java Architecture for XML Binding) library to convert data to XML format.
 * The data is saved and loaded from a file in binary format.
 * This class can handle data of types Customer, Member, and VIP, and all subtypes.
 * 
 * <p>This implementation uses a wrapper class to store the list of data items, and annotates it
 * with JAXB annotations to control the XML format of the output. Each item in the list is annotated
 * with {@code @XmlRootElement} to define its XML element name.</p>
 * 
 * <p>When saving data, the list is wrapped in a DataWrapper object, and then marshalled to XML format.
 * When loading data, the DataWrapper is unmarshalled from the XML file, and its list of items is returned.</p>
 * 
 * <p>Note that all classes used in the data must be annotated with JAXB annotations or be known to the JAXBContext.</p>
 * 
 * <p>Example usage:</p>
 * <pre>
 * DataAdapter adapter = new XmlDataAdapter2();
 * List&lt;Customer&gt; customers = new ArrayList&lt;&gt;();
 * // add customers to the list...
 * adapter.saveData("customers.xml", customers);
 * List&lt;Customer&gt; loadedCustomers = (List&lt;Customer&gt;) adapter.loadData("customers.xml");
 * </pre>
 * 
 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxb/intro/index.html">JAXB Tutorial</a>
 * @see DataAdapter
 * @see Customer
 * @see Member
 * @see VIP
 * @see XmlRootElement
 * @see XmlSeeAlso
 * @see JAXBContext
 * @see Marshaller
 * @see Unmarshaller
 * 
 * @author<u1>@WildanGhaly</u1>
 */
public class XmlDataAdapter2 implements DataAdapter {
    
    @XmlRootElement(name = "data")
    @XmlSeeAlso({ Customer.class, Member.class, VIP.class})
    static class DataWrapper {
        @XmlElement(name = "item")
        List<Object> items;
        public DataWrapper() {}
        public DataWrapper(List<Object> items) {
            this.items = items;
        }
    }

    @Override
    public void saveData(String path, List<?> data) throws IOException, JAXBException {
        DataWrapper wrapper = new DataWrapper(new ArrayList<>(data));
        try (OutputStream os = new FileOutputStream(path)) {
            JAXBContext context = JAXBContext.newInstance(DataWrapper.class, Customer.class, Member.class, VIP.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(wrapper, os);
        }
    }

    @Override
    public List<?> loadData(String path) throws IOException, ClassNotFoundException, JAXBException {
        try (InputStream is = new FileInputStream(path)) {
            JAXBContext context = JAXBContext.newInstance(DataWrapper.class, Customer.class, Member.class, VIP.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            DataWrapper wrapper = (DataWrapper) unmarshaller.unmarshal(is);
            return wrapper.items;
        }
    }
}

