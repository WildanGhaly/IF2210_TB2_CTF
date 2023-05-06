package datastore;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import customer.Customer;
import customer.Member;
import customer.VIP;
import sistemusahabarang.Barang;

/**
 * <p>Class to save and load data from an XML file using JAXB.
 * This class uses Java Architecture for XML Binding (JAXB) to convert data to XML format.
 * Data is saved and loaded in an XML file with the format specified by the DataWrapper class.</p>
 * 
 * <p>Note: The classes for the data being saved and loaded must be annotated with JAXB annotations.</p>
 * 
 * Example usage:
 * <pre>{@code
 * 
 * // create an instance of XmlDataAdapter
 * XmlDataAdapter xmlDataAdapter = new XmlDataAdapter();
 * 
 * // save data to an XML file
 * List<Customer> customers = getCustomers();
 * xmlDataAdapter.saveData("customers.xml", customers);
 * 
 * // load data from an XML file
 * List<Customer> loadedCustomers = (List<Customer>) xmlDataAdapter.loadData("customers.xml");
 * }</pre>
 * @author<u1>@WildanGhaly<u1>
 * @see java.io.Serializable
 * @see DataAdapter
 * @see ObjDataAdapter
 * @see JsonDataAdapter
 */
public class XmlDataAdapter implements DataAdapter {

    /**
     * Saves the given data to an XML file at the specified path using JAXB.
     * The data must be a list of objects that are annotated with JAXB annotations.
     *
     * @param path The path to the file where the data will be saved.
     * @param data The data to be saved to the file.
     * @throws IOException If an I/O error occurs while saving the data.
     * @throws PropertyException If there is an error with the JAXB properties.
     * @throws JAXBException If there is an error with the JAXB context.
     */
    @Override
    public void saveData(String path, List<?> data) throws IOException, PropertyException, JAXBException {
        File file = new File(path);
        JAXBContext jaxbContext = JAXBContext.newInstance(DataWrapper.class, data.get(0).getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // System.out.println("Data here: " + data);
        marshaller.marshal(new DataWrapper(data), file);
    }

    /**
     * Loads data from an XML file at the specified path using JAXB.
     * The data must be in the format specified by the DataWrapper class.
     *
     * @param path The path to the file where the data is stored.
     * @return The data loaded from the file as a List of objects.
     * @throws IOException If an I/O error occurs while loading the data.
     * @throws ClassNotFoundException If the class for the loaded object cannot be found.
     * @throws JAXBException If there is an error with the JAXB context.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<?> loadData(String path) throws IOException {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(DataWrapper.class, Customer.class, Member.class, VIP.class, Barang.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            DataWrapper dataWrapper = (DataWrapper) unmarshaller.unmarshal(file);
            return (List<Object>) dataWrapper.getData();
        } catch (JAXBException e) {
            throw new IOException(e);
        }
    }

    /**
     * Class to wrap the data being saved or loaded in XML format.
     * The data is wrapped in a root element called "data" and each item in the list is wrapped in an element called "item".
     */
    @XmlRootElement
    private static class DataWrapper {
        private List<?> data;

        public DataWrapper() {}

        public DataWrapper(List<?> data) {
            this.data = data;
        }

        @XmlElement(name = "item")
        public List<?> getData() {
            return data;
        }

        public void setData(List<?> data) {
            this.data = data;
        }
    }
}


