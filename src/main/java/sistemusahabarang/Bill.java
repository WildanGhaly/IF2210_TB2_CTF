package sistemusahabarang;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>The Bill class represents a bill containing a collection of items and their corresponding quantities.
 * <p>It has methods to add or remove items from the bill and also to clear the entire bill.
 * <p>The items are stored in a Map data structure where the key is the item ID and the value is the quantity.
 * <p>This class provides easy manipulation of items and their quantities in a bill.
 * <p>It is intended to be used as a data model for representing bills in a retail system, and can be used to store and retrieve information about bills
 * in a database or other data storage mechanism. It can be serialized and deserialized using various data adapters, which allow it to be used in a variety of
 * contexts and technologies.
 * <p>Example usage:
 * <pre> 
 * // create a new bill
 * Bill bill = new Bill();
 * // add item
 * bill.addItem(1, 2);
 * bill.addItem(2, 1);
 * // remove item
 * bill.removeItem(1, 1); 
 * // clear the bill
 * bill.clear();
 * </pre>
 * @author<strong>@WildanGhaly</strong>
 * @see Map
 * @see HashMap
 * 
 */
@Setter @Getter
public class Bill {
    
    // Map to store the items with their corresponding quantities
    protected Map<Integer, Integer> items; // item id -> quantity

    /**
     * Constructs a new Bill object with an empty Map of items
     * @see Bill
     */
    public Bill() {
        items = new HashMap<>();
    }

    /**
     * Adds an item with a given ID and quantity to the bill.
     * If the item already exists in the bill, its quantity is updated with the new quantity.
     * @param itemId the ID of the item to be added
     * @param quantity the quantity of the item to be added
     */
    public void addItem(int itemId, int quantity) {
        int currentQuantity = items.getOrDefault(itemId, 0);
        items.put(itemId, currentQuantity + quantity);
    }

    /**
     * Removes an item with a given ID and quantity from the bill.
     * If the item's quantity becomes zero after removal, it is removed from the bill entirely.
     * @param itemId the ID of the item to be removed
     * @param quantity the quantity of the item to be removed
     */
    public void removeItem(int itemId, int quantity) {
        int currentQuantity = items.getOrDefault(itemId, 0);
        int newQuantity = currentQuantity - quantity;
        if (newQuantity <= 0) {
            items.remove(itemId);
        } else {
            items.put(itemId, newQuantity);
        }
    }

    /**
     * Returns a Map containing the items and their corresponding quantities in the bill.
     * @return a Map containing the items and their corresponding quantities in the bill.
     */
    public Map<Integer, Integer> getItems() {
        return items;
    }

    /**
     * Clears all the items from the bill.
     */
    public void clear() {
        items.clear();
    }
}