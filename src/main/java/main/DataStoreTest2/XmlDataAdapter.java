package main.DataStoreTest2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

public class XmlDataAdapter implements DataAdapter {

    @Override
    public void saveData(String path, List<?> data) throws IOException, JAXBException {
        // create a file object for the specified path
        File file = new File(path);

        // create a JAXB context for the data type
        JAXBContext context = JAXBContext.newInstance(DataWrapper.class);

        // create a marshaller to convert the data to XML
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // wrap the data in a DataWrapper object
        DataWrapper<?> wrapper = new DataWrapper<>(new ArrayList<>(data));

        // write the data to the file in XML format
        marshaller.marshal(wrapper, file);
    }


    @Override
    public List<?> loadData(String path) throws IOException {
        // create a file object for the specified path
        File file = new File(path);

        try {
            // create a JAXB context for the data type
            JAXBContext context = JAXBContext.newInstance(DataWrapper.class);

            // create an unmarshaller to convert the XML to data
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // unmarshal the data from the file
            DataWrapper<?> wrapper = (DataWrapper<?>) unmarshaller.unmarshal(file);

            // return the data as a list
            return new ArrayList<>(wrapper.getData());
        } catch (JAXBException e) {
            throw new IOException("Failed to load data from " + path, e);
        }
    }


}
