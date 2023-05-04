package main.DataStoreTest2;

import java.util.ArrayList;
import java.util.List;

import main.DataStoreTest2.CustomerStatus.Customer;
import main.DataStoreTest2.CustomerStatus.Member;
import main.DataStoreTest2.CustomerStatus.VIP;

public class Main5 {
    
    public static void main(String[] args) {
        final String CUSTOMER_FILE_JSON = "src/main/java/main/DataStoreTest2/database/customer.json";
        final String CUSTOMER_FILE_XML = "src/main/java/main/DataStoreTest2/database/customer.xml";
        final String CUSTOMER_FILE_OBJ = "src/main/java/main/DataStoreTest2/database/customer.obj";
        
        final String MEMBER_FILE_JSON = "src/main/java/main/DataStoreTest2/database/member.json";
        final String MEMBER_FILE_XML = "src/main/java/main/DataStoreTest2/database/member.xml";
        final String MEMBER_FILE_OBJ = "src/main/java/main/DataStoreTest2/database/member.obj";
    
        final String VIP_FILE_JSON = "src/main/java/main/DataStoreTest2/database/vip.json";
        final String VIP_FILE_XML = "src/main/java/main/DataStoreTest2/database/vip.xml";
        final String VIP_FILE_OBJ = "src/main/java/main/DataStoreTest2/database/vip.obj";

        List<Customer> customers = new ArrayList<>();
        List<Member> members = new ArrayList<>();
        List<VIP> vips = new ArrayList<>();

        customers.add(new Customer(1));
        customers.add(new Customer(2));
        customers.add(new Customer(3));

        members.add(new Member(4, "Willy", "1234567890"));
        members.add(new Member(5, "Wildan", "32422222222"));
        members.add(new Member(6, "Ghaly", "00000000000"));

        vips.add(new VIP(7, "WillyVIP", "1234567890"));
        vips.add(new VIP(8, "WildanVIP", "32422222222"));
        vips.add(new VIP(9, "GhalyVIP", "00000000000"));

        DataAdapter adapterJSON = new JsonDataAdapter();
        DataAdapter adapterXML = new XmlDataAdapter();
        DataAdapter adapterOBJ = new ObjDataAdapter();

        try {
            adapterJSON.saveData(CUSTOMER_FILE_JSON, customers);
            adapterJSON.saveData(MEMBER_FILE_JSON, members);
            adapterJSON.saveData(VIP_FILE_JSON, vips);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            adapterXML.saveData(CUSTOMER_FILE_XML, customers);
            adapterXML.saveData(MEMBER_FILE_XML, members);
            adapterXML.saveData(VIP_FILE_XML, vips);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            adapterOBJ.saveData(CUSTOMER_FILE_OBJ, customers);
            adapterOBJ.saveData(MEMBER_FILE_OBJ, members);
            adapterOBJ.saveData(VIP_FILE_OBJ, vips);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Save success");

        List<?> loadedData = null;

        try {
            loadedData = adapterJSON.loadData(CUSTOMER_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterJSON.loadData(MEMBER_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterJSON.loadData(VIP_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load success");

    }

}
