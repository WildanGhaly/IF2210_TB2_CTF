package datastore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.google.gson.internal.LinkedTreeMap;

import customer.Customer;
import customer.Member;
import customer.VIP;

public class DataStoreMechanism {

    private static Object removeById(List<?> data, double id, Class<?> clazz) {
        System.out.println("data added here: " + data);
        for (Iterator<?> it = data.iterator(); it.hasNext();) {
            Object obj = it.next();
            if (obj instanceof VIP && ((VIP) obj).getId() == id) {
                it.remove();
                return ((VIP) obj);
            } else if (obj instanceof Member && ((Member) obj).getId() == id) {
                it.remove();
                return ((Member) obj);
            } else if (obj instanceof Customer && ((Customer) obj).getId() == id) {
                it.remove();
                return ((Customer) obj);
            } else if (obj instanceof LinkedTreeMap && (Double) ((LinkedTreeMap<?, ?>) obj).get("id") == id) {
                it.remove();
                if (clazz == VIP.class){
                    return new VIP((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"), (int) (double) ((LinkedTreeMap<?, ?>) obj).get("points"), (Double) ((LinkedTreeMap<?, ?>) obj).get("totalSpent"), (String) ((LinkedTreeMap<?, ?>) obj).get("name"), (String) ((LinkedTreeMap<?, ?>) obj).get("phoneNumber"));
                } else if (clazz == Member.class){
                    return new Member((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"), (int) (double) ((LinkedTreeMap<?, ?>) obj).get("points"), (Double) ((LinkedTreeMap<?, ?>) obj).get("totalSpent"), (String) ((LinkedTreeMap<?, ?>) obj).get("name"), (String) ((LinkedTreeMap<?, ?>) obj).get("phoneNumber"));
                } else if (clazz == Customer.class){
                    return new Customer((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"), (int) (double) ((LinkedTreeMap<?, ?>) obj).get("points"), (Double) ((LinkedTreeMap<?, ?>) obj).get("totalSpent"));
                }
            }
        }
        return null;
    }

    
    
    public static Object DeleteData(String path, int id, Class<?> clazz) throws ClassNotFoundException, IOException, JAXBException {
        DataAdapter adapter = 
            path.endsWith(".xml")  ? new XmlDataAdapter()  : 
            path.endsWith(".json") ? new JsonDataAdapter() : 
            new ObjDataAdapter();
    
        List<?> data = adapter.loadData(path);
    
        if (data != null) {
            Customer found = (Customer) removeById(data, id, clazz);

            if (found != null) {
                try {
                    adapter.saveData(path, data);
                    return found;
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Error: Data not foundzz");
            }    
        }

        return null;
    }


    public static Customer UpdateCustomer(Customer customer, String newType, String newName, String newPhoneNumber){
        System.out.println(newType);
        if (newType.equals("member")){
            Member member = new Member(customer.getId(), customer.getPoints(), customer.getTotalSpent(), newName, newPhoneNumber);
            return member;
        } else if (newType.equals("vip")){
            System.out.println("Should be here");
            VIP vip = new VIP(customer.getId(), customer.getPoints(), customer.getTotalSpent(), newName, newPhoneNumber);
            System.out.println(vip);
            return vip;
        } else { // deaktivasi
            Customer customers = new Customer(customer.getId(), customer.getId(), customer.getTotalSpent());
            return customers;
        }
    }


    public static boolean Update(int id, String path, String targetPath, String newType, String newName, String newPhoneNumber, Class<?> clazz) throws ClassNotFoundException, IOException, JAXBException{

        Customer updatedCustomer = (Customer) DeleteData(path, id, clazz);
        System.out.println("Updated customer " + updatedCustomer);
        DataAdapter adapter = 
            targetPath.endsWith(".xml")  ? new XmlDataAdapter()  : 
            targetPath.endsWith(".json") ? new JsonDataAdapter() : 
            new ObjDataAdapter();
    
        List<?> data = adapter.loadData(targetPath);
        List<Customer> customers = new ArrayList<>();
        for (Object obj : data){
            if (obj instanceof LinkedTreeMap && clazz == Customer.class){
                customers.add(new Customer((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"), (int) (double) ((LinkedTreeMap<?, ?>) obj).get("points"), (Double) ((LinkedTreeMap<?, ?>) obj).get("totalSpent")));
            } if (obj instanceof LinkedTreeMap && clazz == VIP.class){
                customers.add(new VIP((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"), (int) (double) ((LinkedTreeMap<?, ?>) obj).get("points"), (Double) ((LinkedTreeMap<?, ?>) obj).get("totalSpent"), (String) ((LinkedTreeMap<?, ?>) obj).get("name"), (String) ((LinkedTreeMap<?, ?>) obj).get("phoneNumber")));
            } else if (obj instanceof LinkedTreeMap && clazz == Member.class){
                customers.add(new Member((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"), (int) (double) ((LinkedTreeMap<?, ?>) obj).get("points"), (Double) ((LinkedTreeMap<?, ?>) obj).get("totalSpent"), (String) ((LinkedTreeMap<?, ?>) obj).get("name"), (String) ((LinkedTreeMap<?, ?>) obj).get("phoneNumber")));
            } else {
                customers.add((Customer) obj);
            }
        }

        System.out.println("Was here too");

        if (updatedCustomer != null){
            System.out.println("Was here");
            Customer newCust = UpdateCustomer(updatedCustomer, newType, newName, newPhoneNumber);
            customers.add(newCust);
            adapter.saveData(targetPath, customers);
        }

        return false;
    }
    

    public static void main(String[] args) throws ClassNotFoundException, IOException, JAXBException {
        String path         = "src/main/java/datastore/database/VIP/vip.json";
        String targetPath   = "src/main/java/datastore/database/Member/member.json";
        // DeleteData(path, 4, Member.class);
        Update(8, path, targetPath, "member", "newName", "newNumber", VIP.class);
    }
}
