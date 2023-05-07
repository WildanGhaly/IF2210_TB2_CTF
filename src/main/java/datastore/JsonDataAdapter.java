package datastore;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * The <b>JsonDataAdapter</b> class implements the <code>DataAdapter</code> interface to save and load data from a file in JSON format.
 * This class uses the <b>Gson</b> library to convert data to and from JSON format.
 * <p>To save data, the <code>saveData</code> method writes a List of objects to a specified file path in JSON format using Gson's <code>toJson</code> method.</p>
 * <p>To load data, the <code>loadData</code> method reads a List of objects from a specified file path in JSON format using Gson's <code>fromJson</code> method.</p>
 * @see DataAdapter
 * @see com.google.gson.Gson
 * @see com.google.gson.GsonBuilder
 * @see com.google.gson.reflect.TypeToken
 * @author<u1>@WildanGhaly</u1>
*/
public class JsonDataAdapter implements DataAdapter {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * The saveData method writes a List of objects to a specified file path in JSON format using Gson's toJson method.
     * @param path - the path to the file where the data should be saved
     * @param data - the List of objects to be saved
     * @throws IOException if there is an issue writing the file
     */
    @Override
    public void saveData(String path, List<?> data) throws IOException {
        FileWriter writer = new FileWriter(new File(path));
        gson.toJson(data, writer);
        writer.close();
    }

    /**
     * The loadData method reads a List of objects from a specified file path in JSON format using Gson's fromJson method.
     * @param path - the path to the file where the data is stored
     * @return a List of objects read from the file
     * @throws IOException if there is an issue reading the file
     */
    @Override
    public List<?> loadData(String path) throws IOException {
        FileReader reader = new FileReader(new File(path));
        List<?> data = gson.fromJson(reader, new TypeToken<List<?>>(){}.getType());
        reader.close();
        return data;
    }

    /**
     * The addData method adds an object to a List of objects stored in a file in JSON format.
     * @param path - the path to the file where the data is stored
     * @param data - the object to be added to the file
     * @throws IOException if there is an issue reading or writing the file
     * @see #loadData(String)
     * @see #saveData(String, List)
     */
    @Override
    public void addData(String path, Object data) throws IOException {
        List<?> existingData = loadData(path);
        List<Object> newData = new ArrayList<>(existingData);
        newData.add(data);
        saveData(path, newData);
    }
}

