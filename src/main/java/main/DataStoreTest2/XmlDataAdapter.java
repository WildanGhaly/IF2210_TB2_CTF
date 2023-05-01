package main.DataStoreTest2;

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

public class XmlDataAdapter implements DataAdapter {

    @Override
    public void saveData(String path, List<?> data) throws IOException, PropertyException, JAXBException {
        File file = new File(path);
        JAXBContext jaxbContext = JAXBContext.newInstance(DataWrapper.class, data.get(0).getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // System.out.println("Data here: " + data);
        marshaller.marshal(new DataWrapper(data), file);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<?> loadData(String path) throws IOException {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(DataWrapper.class, Person.class, Customer.class, Product.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            DataWrapper dataWrapper = (DataWrapper) unmarshaller.unmarshal(file);
            return (List<Object>) dataWrapper.getData();
        } catch (JAXBException e) {
            throw new IOException(e);
        }
    }

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


