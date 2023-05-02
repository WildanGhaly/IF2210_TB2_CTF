package main.DataStoreTest2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

public class Main4 {

    public static void main(String[] args) {
        // Create some sample data
        List<Persons> data = new ArrayList<>();
        data.add(new Persons("Wils", 18));
        data.add(new Persons("Wild", 19));
        data.add(new Persons("Will", 20));

        // Save the data to a file
        try {
            DataAdapter adapter = new ObjDataAdapter();
            adapter.saveData("data.obj", data);
            System.out.println("Data saved successfully");
        } catch (IOException | JAXBException e) {
            System.err.println("Failed to save data: " + e.getMessage());
        }

        // Load the data from the file
        try {
            DataAdapter adapter = new ObjDataAdapter();
            List<?> loadedData = adapter.loadData("data.obj");
            System.out.println("Data loaded successfully:");
            for (Object obj : loadedData) {
                System.out.println(obj);
            }
        } catch (IOException e) {
            System.err.println("Failed to load data: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
