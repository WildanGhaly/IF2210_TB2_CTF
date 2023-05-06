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

/**
 * <p>
 * DataStoreMechanism is a <strong>singleton class</strong> that provides <strong>CRUD operations</strong> for various data formats including <strong>XML, JSON, and OBJ</strong>. This class primarily focuses on CRUD operations for <em>User data</em> like <strong>Customer</strong>, <strong>Member</strong>, and <strong>VIP</strong>, while also allowing for support of other data in the future.
 * </p>
 * <p>
 * The <code>{@link #getInstance()}</code> method can be used to access the singleton instance of this class from anywhere in the code. This class provides support for serializable data and uses the <strong>DataAdapter</strong> interface to achieve the desired functionality. This class utilizes various implementations of the DataAdapter interface including <strong>ObjDataAdapter</strong>, <strong>JsonDataAdapter</strong>, and <strong>XmlDataAdapter</strong> to handle the different data formats. This allows for easy implementation of new data formats in the future.
 * </p>
 * <p>
 * Example usage:
 * </p>
 * <pre>{@code
 * // Declare the path to the data file
 * String path = "src/main/java/datastore/database/VIP/vip.json";
 * String targetPath = "src/main/java/datastore/database/Member/member.json";
 * // Call DeleteData to delete data
 * DeleteData(path, 4, Member.class);
 * // Call Update to update data
 * Update(8, path, targetPath, "member", "newName", "newNumber", VIP.class);
 * }</pre>
 * <p>
 * @author<u1><strong>@WildanGhaly</strong></u1>
 * </p>
 * @see java.io.Serializable
 * @see DataAdapter
 * @see ObjDataAdapter
 * @see JsonDataAdapter
 * @see XmlDataAdapter
 * @see customer.Customer
 * @see customer.Member
 * @see customer.VIP
 */
public class DataStoreMechanism {


    /**
     * <p>Removes an object from the given list if the id attribute of that object matches with the provided id.</p>
     * <p>The class of the object is specified through the 'clazz' parameter.</p>
     * <p>The method returns the deleted object as an {@code Object} if it exists, otherwise it returns null.</p>
     * <p>Note that the list must contain objects of the specified class or its subclasses. If not, a {@code ClassCastException} may be thrown.</p>
     * @param data the list of objects to be checked for deletion
     * @param id the id to be matched with the id attribute of an object
     * @param clazz the class of the objects to be deleted
     * @return the deleted object as an {@code Object} if it exists, otherwise null
     * @throws ClassCastException if any object in the list is not an instance of the specified class or its subclasses
     */
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

    
    /**
     * <p>Deletes an object from the file located at the given path if the id attribute of that object matches with the provided id.</p>
     * <p>The class of the object is specified through the 'clazz' parameter.</p>
     * <p>The method reads the file from the specified path and converts it to a list. It then calls the 'removeById' method to delete the object.</p>
     * <p>The method returns the deleted object as an {@code Object} if it exists, otherwise it returns null.</p>
     * <p>Note that the file must contain objects of the specified class or its subclasses. If not, a {@code ClassCastException} may be thrown.</p>
     * @param path the path of the file to be read
     * @param id the id to be matched with the id attribute of an object
     * @param clazz the class of the objects to be deleted
     * @return the deleted object as an {@code Object} if it exists, otherwise null
     * @throws ClassNotFoundException if the class specified by the 'clazz' parameter is not found
     * @throws IOException if an I/O error occurs while reading the file
     * @throws JAXBException if there is an error in unmarshalling the XML file
     * @throws ClassCastException if any object in the file is not an instance of the specified class or its subclasses
     * @see #removeById(List, double, Class)
     * @see DataAdapter
     * @see ObjDataAdapter
     * @see JsonDataAdapter
     */
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

    
    /**
     * <p>Updates the provided {@code Customer} object with the new type, name, and phone number (if applicable).</p>
     * <p>The 'newType' parameter specifies the new type of the customer, which can be 'Customer', 'Member', or 'VIP'.</p>
     * <p>If the new type is 'Customer', only the 'id', 'points', and 'totalSpent' attributes of the customer object are updated.</p>
     * <p>If the new type is 'Member' or 'VIP', the 'name' and 'phoneNumber' attributes of the customer object are also updated.</p>
     * <p>The updated customer object is returned as the result of the method.</p>
     * @param customer the {@code Customer} object to be updated
     * @param newType the new type of the customer: 'Customer', 'Member', or 'VIP'
     * @param newName the new name of the customer (applicable only if the new type is 'Member' or 'VIP')
     * @param newPhoneNumber the new phone number of the customer (applicable only if the new type is 'Member' or 'VIP')
     * @return the updated {@code Customer} object
     * @see Customer
     * @see Member
     * @see VIP
     */
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


    /**
     * <p>Updates the specified file in the given path with the new type, name, and phone number (if applicable).</p>
     * <p>The 'id' parameter specifies the identifier of the customer, member, or VIP to be updated.</p>
     * <p>The 'path' parameter specifies the path of the file to be updated.</p>
     * <p>The 'targetPath' parameter specifies the path of the target file where the updated data will be saved.</p>
     * <p>The 'newType' parameter specifies the new type of the data, which can be 'Customer', 'Member', or 'VIP'.</p>
     * <p>If the new type is 'Customer', only the 'id', 'points', and 'totalSpent' attributes of the data are updated.</p>
     * <p>If the new type is 'Member' or 'VIP', the 'name' and 'phoneNumber' attributes of the data are also updated.</p>
     * <p>The 'clazz' parameter specifies the class of the data to be updated, which can be 'Customer', 'Member', or 'VIP'.</p>
     * <p>The 'newName' parameter specifies the new name of the data (applicable only if the new type is 'Member' or 'VIP').</p>
     * <p>The 'newPhoneNumber' parameter specifies the new phone number of the data (applicable only if the new type is 'Member' or 'VIP').</p>
     * <p>The method returns 'true' if the update is successful, and 'false' otherwise.</p>
     * <p>This method calls the UpdateCustomer method to perform the update operation.</p>
     * <p>The file format supported are JSON, XML, and OBJ. The method uses the XmlDataAdapter, JsonDataAdapter, and ObjDataAdapter classes to parse the files.</p>
     * @param id the identifier of the customer, member, or VIP to be updated
     * @param path the path of the file to be updated
     * @param targetPath the path of the target file where the updated data will be saved
     * @param newType the new type of the data: 'Customer', 'Member', or 'VIP'
     * @param newName the new name of the data (applicable only if the new type is 'Member' or 'VIP')
     * @param newPhoneNumber the new phone number of the data (applicable only if the new type is 'Member' or 'VIP')
     * @param clazz the class of the data to be updated: 'Customer', 'Member', or 'VIP'
     * @return true if the update is successful, false otherwise
     * @throws ClassNotFoundException if the specified class is not found
     * @throws IOException if there is an error in reading or writing the file
     * @throws JAXBException if there is an error in marshalling or unmarshalling the XML file
     * @see Customer
     * @see Member
     * @see VIP
     * @see XmlDataAdapter
     * @see JsonDataAdapter
     * @see ObjDataAdapter
     * @see DataAdapter
     * @see #DeleteData(String, int, Class)
     * @see #UpdateCustomer(Customer, String, String, String)
    */
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
