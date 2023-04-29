package main.DataStoreTest2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonDataAdapter implements DataAdapter {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void saveData(String path, List<?> data) throws IOException {
        FileWriter writer = new FileWriter(new File(path));
        gson.toJson(data, writer);
        writer.close();
    }

    @Override
    public List<?> loadData(String path) throws IOException {
        FileReader reader = new FileReader(new File(path));
        List<?> data = gson.fromJson(reader, new TypeToken<List<?>>(){}.getType());
        reader.close();
        return data;
    }
}

