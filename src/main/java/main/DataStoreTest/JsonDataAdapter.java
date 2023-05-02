package main.DataStoreTest;

import com.google.gson.Gson;

public class JsonDataAdapter implements DataStore {

    private Gson gson;

    public JsonDataAdapter() {
        this.gson = new Gson();
    }

    @Override
    public void saveData(Object data) {
        // String json = gson.toJson(data);
        // save json to file
    }

    @Override
    public Object loadData() {
        // load json from file
        String json = "";
        return gson.fromJson(json, Object.class);
    }
}
