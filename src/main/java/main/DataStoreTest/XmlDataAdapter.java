package main.DataStoreTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlDataAdapter implements DataStore {

    @Override
    public void saveData(Object data) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(data.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(data, new FileWriter("data.xml"));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object loadData() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new FileReader("data.xml"));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

