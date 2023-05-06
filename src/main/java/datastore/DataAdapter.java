package datastore;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

/**
 * <p>
 * The DataAdapter interface provides methods for saving and loading data from a file.
 * It is designed to be implemented by classes that need to save and load data in various formats,
 * such as XML, JSON, or binary.
 * </p>
 * <p>
 * The interface provides two methods: saveData and loadData. The saveData method accepts a path and a List
 * of objects to be saved, and writes the data to the specified file location. The loadData method reads data
 * from a file at the specified path, and returns a List of objects.
 * </p>
 * <p>
 * Classes that implement the DataAdapter interface should provide implementation for the saveData and loadData
 * methods according to the specific format that they handle. Implementations may use third-party libraries or
 * built-in Java APIs to achieve the desired functionality.
 * </p>
 * <p>
 * This interface is useful for applications that need to store and retrieve data from a file, especially
 * when the data needs to be in a specific format. It promotes code reusability and flexibility by providing
 * a standard interface for saving and loading data.
 * </p>
 * <p>
 * @author<u1>@WildanGhaly</u1>
 * </p>
*/
public interface DataAdapter {
    /**
     * The saveData method accepts a path and a List of objects to be saved, and writes the data to the specified file location.
     * @param path - the path to the file where the data should be saved
     * @param data - the List of objects to be saved
     * @throws IOException if there is an issue writing the file
     * @throws PropertyException if there is an issue with the Java Architecture for XML Binding (JAXB)
     * @throws JAXBException if there is an issue with the JAXB implementation
     */
    void saveData(String path, List<?> data) throws IOException, PropertyException, JAXBException;

    /**
     * The loadData method reads data from a file at the specified path, and returns a List of objects.
     * @param path - the path to the file where the data is stored
     * @return a List of objects read from the file
     * @throws IOException if there is an issue reading the file
     * @throws ClassNotFoundException if the class of the serialized object cannot be found
     * @throws JAXBException if there is an issue with the JAXB implementation
    */
    List<?> loadData(String path) throws IOException, ClassNotFoundException, JAXBException;
}
