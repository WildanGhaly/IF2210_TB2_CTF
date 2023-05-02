package main.DataStoreTest2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

public class Main2 {

    public static void main(String[] args) throws JAXBException {
        // create some sample data to save to the XML file
        List<String> data = new ArrayList<>();
        data.add("apple");
        data.add("banana");
        data.add("cherry");

        // create an instance of the XmlDataAdapter class
        XmlDataAdapter adapter = new XmlDataAdapter();

        try {
            // save the data to an XML file
            adapter.saveData("data.xml", data);
            System.out.println("Data saved to data.xml");

            // load the data from the XML file
            List<?> loadedData = adapter.loadData("data.xml");
            System.out.println("Data loaded from data.xml:");
            for (Object item : loadedData) {
                System.out.println(item.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

