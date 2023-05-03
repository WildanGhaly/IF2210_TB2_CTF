package datastore;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

public interface DataAdapter {
    void saveData(String path, List<?> data) throws IOException, PropertyException, JAXBException;
    List<?> loadData(String path) throws IOException, ClassNotFoundException;
}
