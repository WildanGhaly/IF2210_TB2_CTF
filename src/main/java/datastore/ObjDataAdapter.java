package datastore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

/**
 * Interface to save and load data from OBJ file.
 * OBJ is generally used for <b>3D model files</b>.
 * This class uses Java's built-in <code>serialization</code> to save and load data.
 * This class will save and load data in <b>binary format</b>.
 * <p>
 * <b>Note:</b> When using this adapter, the objects being saved and loaded must implement the <code>java.io.Serializable</code> interface.
 * </p>
 * <p>
 * Example usage:
 * <pre>{@code
 * ObjDataAdapter adapter = new ObjDataAdapter();
 * List<MyObject> objects = new ArrayList<>();
 * // add objects to list
 * adapter.saveData("path/to/file.obj", objects);
 * List<MyObject> loadedObjects = (List<MyObject>) adapter.loadData("path/to/file.obj");
 * }</pre>
 * </p>
 * @author<u1>@WildanGhaly</u1>
 * @see java.io.Serializable
 * @see DataAdapter
 * @see XmlDataAdapter
 * @see JsonDataAdapter
 */
public class ObjDataAdapter implements DataAdapter {

    /**
     * Saves a list of objects to the specified file path in binary OBJ format using Java's ObjectOutputStream.
     * @param path the file path to save the data to
     * @param data the list of objects to be saved
     * @throws IOException if there is an error while writing to the file
     * @throws PropertyException if there is an error with the properties of the file
     * @throws JAXBException if there is an error while converting the data to XML format
     */
    @Override
    public void saveData(String path, List<?> data) throws IOException, PropertyException, JAXBException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(data);
        }
    }

    /**
     * Loads and returns a list of objects saved in the specified file path in binary OBJ format using Java's ObjectInputStream.
     * @param path the file path to load the data from
     * @return the list of objects saved in the specified file path
     * @throws IOException if there is an error while reading from the file
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<?> loadData(String path) throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Object>) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Failed to load data from " + path, e);
        }
    }

    /**
     * Adds the given data to the specified file path in binary OBJ format using Java's ObjectOutputStream.
     * @param path the file path to add the data to
     * @param data the data to be added
     * @throws IOException if there is an error while writing to the file
     * @throws PropertyException if there is an error with the properties of the file
     * @throws JAXBException if there is an error while converting the data to XML format
     * @see #saveData(String, List)
     * @see #loadData(String)
     */
    public void addData(String path, Object data) throws IOException, PropertyException, JAXBException {
        List<?> existingData = loadData(path);
        List<Object> newData = new ArrayList<>(existingData);
        newData.add(data);
        saveData(path, newData);
    }

}