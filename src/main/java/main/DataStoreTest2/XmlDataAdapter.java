package main.DataStoreTest2;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XmlDataAdapter implements DataAdapter {

    @Override
    public void saveData(String path, List<?> data) throws IOException {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(path));
        System.out.println(data);
        encoder.writeObject(data);
        System.out.println(data);
        encoder.close();
    }

    @Override
    public List<?> loadData(String path) throws IOException
    {
        List<?> data = null;
        XMLDecoder decoder = new XMLDecoder(new FileInputStream(path));
        data = (List<?>)decoder.readObject();
        decoder.close();
        return data;
    }
}
