package datastore;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import com.google.gson.internal.LinkedTreeMap;

import customer.Customer;
import customer.Member;
import customer.VIP;
import sistemusahabarang.Barang;
import sistemusahabarang.History;

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
 * Update(8, 1000, path, targetPath, "member", "newName", "newNumber", VIP.class);
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
     * @param orderAmount the amount of the order to be added to the customer's total spent (applicable only if the new type is 'Member' or 'VIP')
     * @param newType the new type of the customer: 'Customer', 'Member', or 'VIP'
     * @param newName the new name of the customer (applicable only if the new type is 'Member' or 'VIP')
     * @param newPhoneNumber the new phone number of the customer (applicable only if the new type is 'Member' or 'VIP')
     * @return the updated {@code Customer} object
     * @see Customer
     * @see Member
     * @see VIP
     */
    public static Customer UpdateCustomer(Customer customer, double orderAmount, String newType, String newName, String newPhoneNumber){
        System.out.println(newType);
        if (newType.equals("member")){
            Member member = new Member(customer.getId(), customer.getPoints(), customer.getTotalSpent(), newName, newPhoneNumber);
            double discount = member.applyPoints(orderAmount);
            member.addOrder(orderAmount - discount);
            return member;
        } else if (newType.equals("vip")){
            System.out.println("Should be here");
            VIP vip = new VIP(customer.getId(), customer.getPoints(), customer.getTotalSpent(), newName, newPhoneNumber);
            double discount = vip.applyPoints(orderAmount);
            vip.addOrder(orderAmount - discount);
            return vip;
        } else { // deaktivasi
            Customer customers = new Customer(customer.getId(), customer.getId(), customer.getTotalSpent());
            customers.addOrder(orderAmount);
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
     * @param orderAmount the amount of the order to be added to the total spent of the customer
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
    public static boolean Update(int id, double orderAmount, String path, String targetPath, String newType, String newName, String newPhoneNumber, Class<?> clazz) throws ClassNotFoundException, IOException, JAXBException{

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
            Customer newCust = UpdateCustomer(updatedCustomer, orderAmount, newType, newName, newPhoneNumber);
            customers.add(newCust);
            adapter.saveData(targetPath, customers);
        }

        return false;
    }

    /** 
     * <p>The following method can be used to calculate the total price of a set of items based on their respective ids and amounts,
     * and decrease the stock of the items in a database file located at the specified path.</p>
     * <p>The database file must be in XML, JSON, or OBJ format, and the method uses the <code>DataAdapter</code> interface class, as well as <code>XmlDataAdapter</code>, <code>JsonDataAdapter</code>, and <code>ObjDataAdapter</code> classes.</p>
     * <p>To use this method, simply provide the path to the database file and a map of item ids and amounts to calculate the total price of the items. The method returns the total price of the items based on their sell prices in the database.</p>
     * <p>Note that this method updates the stock of items in the database based on the amount sold.</p>
     * <ul>
     *     <li><code>path</code>: The path to the database file.</li>
     *     <li><code>items</code>: A map of item ids and their respective amounts.</li>
     * </ul>
     * <p>The method may throw the following exceptions:</p>
     * <ul>
     *     <li><code>ClassNotFoundException</code>: If the data adapter class for the specified file type is not found.</li>
     *     <li><code>IOException</code>: If there is an error reading from the database file.</li>
     *     <li><code>JAXBException</code>: If there is an error parsing the XML data from the database file.</li>
     * </ul>
     * <p>See the following classes for more information:</p>
     * <ul>
     *     <li><code>DataAdapter</code></li>
     *     <li><code>XmlDataAdapter</code></li>
     *     <li><code>JsonDataAdapter</code></li>
     *     <li><code>ObjDataAdapter</code></li>
     * </ul>
     * <p>The method signature is as follows:</p>
     * <pre>
     * public double calculateTotalPrice(String path, Map&lt;String, Integer&gt; items) throws ClassNotFoundException, IOException, JAXBException
     * </pre>
     * <p>The method returns the total price of the items as a <code>double</code> value.</p>
     */
    public static double getItemsPrice(String path, Map<Integer, Integer> items) throws ClassNotFoundException, IOException, JAXBException{
        double price = 0;
        int amount = 0;
        int stock = 0;
        List<Barang> barang = new ArrayList<>();
        int id;
        double itemPrice = 0;
        DataAdapter adapter = 
            path.endsWith(".xml")  ? new XmlDataAdapter()  : 
            path.endsWith(".json") ? new JsonDataAdapter() : 
            new ObjDataAdapter();
        
        List<?> data = adapter.loadData(path);

        for (Object obj : data){
            if (obj instanceof LinkedTreeMap){
                LinkedTreeMap<?, ?> map = (LinkedTreeMap<?, ?>) obj;
                id = (int) (double) map.get("id");
                stock = (int) (double) map.get("stock");
                if (items.containsKey(id)){
                    amount = items.get(id);
                    itemPrice = (double) map.get("sellPrice");
                    price += itemPrice * amount;
                    barang.add(new Barang(id, stock - amount, (String) map.get("name"), (double) map.get("sellPrice"), (double) map.get("buyPrice"), (String) map.get("kategori"), (String) map.get("image")));
                } else {
                    barang.add(new Barang(id, (int) (double) map.get("stock"), (String) map.get("name"), (double) map.get("sellPrice"), (double) map.get("buyPrice"), (String) map.get("kategori"), (String) map.get("image")));
                }
            } else if (obj instanceof Barang){
                if (items.containsKey(((Barang) obj).getId())){
                    price += ((Barang) obj).getSellPrice() * items.get(((Barang) obj).getId());
                    barang.add(new Barang(((Barang) obj).getId(), ((Barang) obj).getStock() - items.get(((Barang) obj).getId()), ((Barang) obj).getName(), ((Barang) obj).getSellPrice(), ((Barang) obj).getBuyPrice(), ((Barang) obj).getKategori(), ((Barang) obj).getImage()));
                } else {
                    barang.add((Barang) obj);
                }
            } 
        }
        adapter.saveData(path, barang);
        return price;
    }


    /**
     * <p>The following method can be used to get the history of transactions for a customer with the specified name from a database file located at the specified path.</p>
     * <p>The database file must be in XML, JSON, or OBJ format, and the method uses the <code>DataAdapter</code> interface class, as well as <code>XmlDataAdapter</code>, <code>JsonDataAdapter</code>, and <code>ObjDataAdapter</code> classes.</p>
     * <p>To use this method, simply provide the path to the database file and the name of the customer. The method returns a 2D array of strings containing the history of transactions for the customer.</p>
     * <p>Note that this method does not update the database file.</p>
     * <ul>
     *    <li><code>path</code>: The path to the database file.</li>
     *   <li><code>name</code>: The name of the customer.</li>
     * </ul>
     * <p>The method may throw the following exceptions:</p>
     * <ul>
     *    <li><code>ClassNotFoundException</code>: If the data adapter class for the specified file type is not found.</li>
     *   <li><code>IOException</code>: If there is an error reading from the database file.</li>
     *  <li><code>JAXBException</code>: If there is an error parsing the XML data from the database file.</li>
     * </ul>
     * <p>See the following classes for more information:</p>
     * <ul>
     *   <li><code>DataAdapter</code></li>
     * <li><code>XmlDataAdapter</code></li>
     *  <li><code>JsonDataAdapter</code></li>
     *  <li><code>ObjDataAdapter</code></li>
     * </ul>
     * <p>The method signature is as follows:</p>
     * <pre>
     * public String[][] getHistoryTransaction(String path, String name) throws ClassNotFoundException, IOException, JAXBException
     * </pre>
     * <p>The method returns a 2D array of strings containing the history of transactions for the customer.</p>
     * <p>The first dimension of the array represents the transaction, and the second dimension represents the following information:</p>
     * <ul>
     *  <li><code>0</code>: The name of the name of item.</li>
     * <li><code>1</code>: The date of the transaction.</li>
     * <li><code>2</code>: The time of the transaction.</li>
     * <li><code>3</code>: The items purchased in the transaction.</li>
     * <li><code>4</code>: The total price of the transaction.</li>
     * </ul>
     * <p>For example, the following code can be used to get the history of transactions for a customer with the name <code>"Wildan Ghaly"</code> from a database file located at <code>"./database.xml"</code>:</p>
     * <pre>
     * String[][] history = getHistoryTransaction("./database.xml", "Wildan Ghaly");
     * </pre>
     * @param path The path to the database file.
     * @param name The name of the customer.
     * @return A 2D array of strings containing the history of transactions for the customer.
     * @throws ClassNotFoundException If the data adapter class for the specified file type is not found.
     * @throws IOException If there is an error reading from the database file.
     * @throws JAXBException If there is an error parsing the XML data from the database file.
     * @see DataAdapter
     * @see XmlDataAdapter
     * @see JsonDataAdapter
     * @see ObjDataAdapter
     * @see #getHistoryTransaction(String path, String name)
     */
    public static String[][] getHistoryTransaction(String path, String name) throws ClassNotFoundException, IOException, JAXBException{
        ArrayList<String[]> history = new ArrayList<>();
        DataAdapter adapter = 
            path.endsWith(".xml")  ? new XmlDataAdapter()  : 
            path.endsWith(".json") ? new JsonDataAdapter() : 
            new ObjDataAdapter();
        
        List<?> data = adapter.loadData(path);

        for (Object obj : data){
            if (obj instanceof LinkedTreeMap){
                LinkedTreeMap<?, ?> map = (LinkedTreeMap<?, ?>) obj;
                if (map.get("name").equals(name)){
                    history.add(new String[]{(String) map.get("name"), (String) map.get("date"), (String) map.get("time"), (String) map.get("items"), (String) map.get("totalPrice")});
                }
            } else if (obj instanceof History){
                if (((History) obj).getName().equals(name)){
                    history.add(new String[]{((History) obj).getItemName(), ((History) obj).getDate(), Integer.toString(((History) obj).getQuantity()), Double.toString(((History) obj).getPrice()), Double.toString(((History) obj).getTotal())});
                }
            } 
        }
        String[][] result = new String[history.size()][5];
        for (int i = 0; i < history.size(); i++){
            result[i] = history.get(i);
        }
        return result;
    }


    /**
     * <p>The following method can be used to save a transaction history to a database file located at the specified path.</p>
     * <p>The database file must be in XML, JSON, or OBJ format, and the method uses the <code>DataAdapter</code> interface class, as well as <code>XmlDataAdapter</code>, <code>JsonDataAdapter</code>, and <code>ObjDataAdapter</code> classes.</p>
     * <p>To use this method, simply provide the path to the database file, the path to the item database file, a map of item ids and amounts, the name of the customer, and the id of the customer. The method returns <code>true</code> if the history was saved successfully, and <code>false</code> otherwise.</p>
     * <p>Note that this method DOES NOT updates the stock of items in the database based on the amount sold.</p>
     * <ul>
     *    <li><code>path</code>: The path to the database file.</li>
     *   <li><code>itemPath</code>: The path to the item database file.</li>
     *  <li><code>items</code>: A map of item ids and their respective amounts.</li>
     * <li><code>name</code>: The name of the customer.</li>
     * <li><code>id</code>: The id of the customer.</li>
     * </ul>
     * <p>The method may throw the following exceptions:</p>
     * <ul>
     *    <li><code>ClassNotFoundException</code>: If the data adapter class for the specified file type is not found.</li>
     *  <li><code>IOException</code>: If there is an error reading from the database file.</li>
     * <li><code>JAXBException</code>: If there is an error parsing the XML data from the database file.</li>
     * </ul>
     * <p>See the following classes for more information:</p>
     * <ul>
     *   <li><code>DataAdapter</code></li>
     * <li><code>XmlDataAdapter</code></li>
     * <li><code>JsonDataAdapter</code></li>
     * <li><code>ObjDataAdapter</code></li>
     * </ul>
     * <p>The method signature is as follows:</p>
     * <pre>
     * public boolean saveHistory(String path, String itemPath, Map&lt;Integer, Integer&gt; items, String name, int id) throws ClassNotFoundException, IOException, JAXBException
     * </pre>
     * <p>Code example:</p>
     * <pre>
     * ... // Assume that the following variables are declared and initialized:
     * String path = "history.xml";
     * String itemPath = "items.xml";
     * Map&lt;Integer, Integer&gt; items = new HashMap&lt;&gt;();
     * ... // Add items to the map
     * String name = "Wildan Ghaly";
     * int id = 1;
     * ...
     * DataStoreMechanism.saveHistory(path, itemPath,items, name, id)
     * </pre>
     * @param path The path to the database file.
     * @param itemPath The path to the item database file.
     * @param items A map of item ids and their respective amounts.
     * @param name The name of the customer.
     * @param id The id of the customer.
     * @return <code>true</code> if the history was saved successfully, and <code>false</code> otherwise.
     * @throws ClassNotFoundException If the data adapter class for the specified file type is not found.
     * @throws IOException If there is an error reading from the database file.
     * @throws JAXBException If there is an error parsing the XML data from the database file.
     * @see DataAdapter
     * @see XmlDataAdapter
     * @see JsonDataAdapter
     * @see ObjDataAdapter
     * @see #saveHistory(String, String, Map, String, int)
     */
    public static boolean saveHistory(String path, String itemPath, Map<Integer, Integer> items, String name, int id) throws ClassNotFoundException, IOException, JAXBException{
        DataAdapter adapter = 
            path.endsWith(".xml")  ? new XmlDataAdapter()  : 
            path.endsWith(".json") ? new JsonDataAdapter() : 
            new ObjDataAdapter();
            
        List<History> history = new ArrayList<>();
        List<?> data = adapter.loadData(itemPath);

        for (Object obj : data){
            if (obj instanceof Barang && items.containsKey(((Barang) obj).getId())){
                history.add(new History(id, name, ((Barang) obj).getName(), LocalDate.now().toString(), items.get(((Barang) obj).getId()), ((Barang) obj).getSellPrice(), ((Barang) obj).getSellPrice() * items.get(((Barang) obj).getId())));
            } else if (obj instanceof LinkedTreeMap && items.containsKey((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"))){
                history.add(new History(id, name, (String) ((LinkedTreeMap<?, ?>) obj).get("name"), LocalDate.now().toString(), items.get((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id")), (double) ((LinkedTreeMap<?, ?>) obj).get("sellPrice"), (double) ((LinkedTreeMap<?, ?>) obj).get("sellPrice") * items.get((int) (double) ((LinkedTreeMap<?, ?>) obj).get("id"))));
            }
        }

        for (History h : history){
            System.out.println(h);
            adapter.addData(path, h);
        }

        return true;
    }



    /**
     * <p> Main method for testing the DataStoreMechanism class. </p>
     * @param args
     * @throws ClassNotFoundException
     * @throws IOException
     * @throws JAXBException
     */

    public static void main(String[] args) throws ClassNotFoundException, IOException, JAXBException {
        String path         = "src/main/java/datastore/database/VIP/vip.json";
        String targetPath   = "src/main/java/datastore/database/VIP/vip.json";
        String path2        = "src/main/java/datastore/database/Barang/barang.xml";
        String historyPath  = "src/main/java/datastore/database/History/history.xml";
        // DeleteData(path, 4, Member.class);
        Update(8, 1000, path, targetPath, "vip", "newName", "newNumber", VIP.class);
        double barangPrice = getItemsPrice(path2, new HashMap<Integer, Integer>(){{
            put(1, 10);
            put(2, 4);
        }});
        System.out.println(barangPrice);

        System.out.println("\n===================================================\n");

        String[][] data = DataStoreMechanism.getHistoryTransaction(historyPath, "Willy");
        for (String[] s : data){
            for (String s2 : s){
                System.out.print(s2 + " ");
            }
            System.out.println();
        }
    }
}
