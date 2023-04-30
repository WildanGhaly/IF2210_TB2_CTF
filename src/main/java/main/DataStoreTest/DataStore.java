package main.DataStoreTest;

public interface DataStore {
    void saveData(Object data);
    Object loadData();
}

// public class DataStore {
//     private DataAdapter adapter;

//     public DataStore(DataAdapter adapter) {
//         this.adapter = adapter;
//     }

//     public <T> void saveData(String context, String key, T data) {
//         adapter.saveData(context, key, data);
//     }

//     public <T> T getData(String context, String key, Class<T> clazz) {
//         return adapter.getData(context, key, clazz);
//     }
// }

