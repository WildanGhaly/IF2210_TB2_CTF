package main.DataStoreTest2;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataWrapper<T> {

    private ArrayList<T> data;

    public DataWrapper() {
        data = new ArrayList<T>();
    }

    public DataWrapper(ArrayList<T> data) {
        this.data = data;
    }

    @XmlElement(name="item")
    public ArrayList<T> getData() {
        return data;
    }

    public void setData(ArrayList<T> data) {
        this.data = data;
    }
}
