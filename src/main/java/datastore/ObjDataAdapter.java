package datastore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

public class ObjDataAdapter implements DataAdapter {

    @Override
    public void saveData(String path, List<?> data) throws IOException, PropertyException, JAXBException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(data);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<?> loadData(String path) throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Object>) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Failed to load data from " + path, e);
        }
    }

}