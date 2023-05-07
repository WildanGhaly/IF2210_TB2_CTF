package sistemusahabarang;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import datastore.DataStoreMechanism;


/**
 * <p>The FixedBill class is a subclass of the Bill class and represents a bill containing a collection of fixed items
 * with a predetermined price. 
 * <p>It has a method to calculate the total price of the items in the bill by reading from an {@code XML}, {@code JSON}, or {@code OBJ} file
 * and a main method to test its functionality.
 * <p> Example usage:
 * <pre>
 * String path        = "src/main/java/datastore/database/Barang/barang.xml";
 * // initialize
 *FixedBill bill     = new FixedBill();
 * // insert item
 *bill.addItem(1, 2);
 *bill.addItem(2, 4);
 *bill.addItem(1, 1);
 * // get total price
 *double totalPrice = bill.getTotalPrice(path);
 *System.out.println(totalPrice);
 *</pre>
 * @author<strong>@WildanGhaly</strong>
 * @see DataStoreMechanism
 */
public class FixedBill extends Bill {

    /**
     * Calculates the total price of the fixed items in the bill by reading the items and their prices from an XML file.
     * @param path the path of the XML file containing the items and their prices
     * @return the total price of the items in the bill
     * @throws ClassNotFoundException if the class specified in the XML file cannot be found
     * @throws IOException if an I/O exception occurs while reading the XML file
     * @throws JAXBException if an error occurs while unmarshalling the XML file
     * @see DataStoreMechanism 
     */
    public double getTotalPrice(String path) throws ClassNotFoundException, IOException, JAXBException {
        double totalPrice = DataStoreMechanism.getItemsPrice(path, this.items);
        return totalPrice;
    }

    /**
     * Saves the items in the bill to an XML, JSON, or OBJ file.
     * @param path the path of the XML, JSON, or OBJ file to save the items to
     * @param itemPath the path of the XML, JSON, or OBJ file containing the items
     * @param bill the bill containing the items to be saved
     * @param name the name of the <strong>customer</strong>
     * @param id the ID of the <strong>customer</strong>
     * @return {@code true} if the items are saved successfully, {@code false} otherwise
     * @throws IOException if an I/O exception occurs while reading the XML, JSON, or OBJ file
     * @throws JAXBException if an error occurs while unmarshalling the XML, JSON, or OBJ file
     * @throws ClassNotFoundException if the class specified in the XML, JSON, or OBJ file cannot be found
     * @see DataStoreMechanism
     */
    public static boolean saveHistory(String path, String itemPath, FixedBill bill, String name, int id) throws IOException, JAXBException, ClassNotFoundException {
        return DataStoreMechanism.saveHistory(path, itemPath, bill.getItems(), name, id);
    }
    
    /**
     * A main method to test the functionality of the FixedBill class.
     * It creates a FixedBill object, adds some items to it, calculates the total price of the items,
     * and prints the result to the console.
     * @param args an array of command-line arguments
     * @throws ClassNotFoundException if the class specified in the XML file cannot be found
     * @throws IOException if an I/O exception occurs while reading the XML file
     * @throws JAXBException if an error occurs while unmarshalling the XML file
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException, JAXBException {
        String path        = "src/main/java/datastore/database/Barang/barang.xml";
        FixedBill bill     = new FixedBill();
        
        bill.addItem(1, 2);
        bill.addItem(2, 4);
        bill.addItem(1, 1);

        double totalPrice = bill.getTotalPrice(path);
        System.out.println(totalPrice);

        System.out.println("\n=========================================\n");

        String historyPath = "src/main/java/datastore/database/History/history.xml";

        FixedBill.saveHistory(historyPath, path, bill, "Wildan", 1);
    }

}