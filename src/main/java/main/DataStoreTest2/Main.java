package main.DataStoreTest2;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String PRODUCT_FILE_JSON = "src/main/java/main/DataStoreTest2/database/product.json";
        final String CUSTOMER_FILE_JSON = "src/main/java/main/DataStoreTest2/database/customer.json";
        final String PRODUCT_FILE_XML = "src/main/java/main/DataStoreTest2/database/product.xml";
        final String CUSTOMER_FILE_XML = "src/main/java/main/DataStoreTest2/database/customer.xml";

        Product product = new Product(1, "Product 1", 600.0);
        Customer customer = new Customer(1, "Customer 1", "1234567890");
        System.out.println(product);

        DataAdapter adapterJSON = new JsonDataAdapter();
        DataAdapter adapterXML = new XmlDataAdapter();

        try {
            List<?> data = adapterJSON.loadData(PRODUCT_FILE_JSON);
            for (int i = 0; i < 10; i++){
                ((List<Object>) data).add(i, product);
            }
            adapterJSON.saveData(PRODUCT_FILE_JSON, data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PropertyException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        try {
            List<?> data = adapterJSON.loadData(CUSTOMER_FILE_JSON);
            for (int i = 0; i < 10; i++){
                ((List<Object>) data).add(i, customer);
            }
            adapterJSON.saveData(CUSTOMER_FILE_JSON, data);
            System.out.println(data);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }

        try {

            adapterXML.saveData(CUSTOMER_FILE_XML, List.of(customer));
            List<?> data = adapterXML.loadData(CUSTOMER_FILE_XML);
            System.out.println(data);
            for (int i = 0; i < 10; i++){
                ((List<Object>) data).add(i, customer);
            }
            adapterXML.saveData(CUSTOMER_FILE_XML, data);
            System.out.println(data);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }

        // try {
        //     adapterXML.saveData(PRODUCT_FILE_XML, List.of(product));
        //     List<?> data = adapterXML.loadData(PRODUCT_FILE_XML);
        //     for (int i = 0; i < 10; i++){
        //         ((List<Object>) data).add(i, product);
        //     }
        //     adapterXML.saveData(PRODUCT_FILE_XML, data);
        //     System.out.println(data);
        // } catch (IOException | JAXBException e) {
        //     e.printStackTrace();
        // }
    }
}
