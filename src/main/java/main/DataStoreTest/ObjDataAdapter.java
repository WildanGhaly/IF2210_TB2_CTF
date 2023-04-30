package main.DataStoreTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjDataAdapter implements DataStore {

    @Override
    public void saveData(Object data) {
        try {
            FileOutputStream fos = new FileOutputStream("data.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object loadData() {
        try {
            FileInputStream fis = new FileInputStream("data.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
