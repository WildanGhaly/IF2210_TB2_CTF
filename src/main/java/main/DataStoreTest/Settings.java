package main.DataStoreTest;

public class Settings {
    private static DataStore dataStore = new JsonDataAdapter();

    public static void setDataStore(DataStore dataStore) {
        Settings.dataStore = dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }
}

