package sistemusahabarang;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author user
 */
@Setter @Getter
public class Bill {
    protected Map<Integer, Integer> items; // item id -> quantity

    public Bill() {
        items = new HashMap<>();
    }

    public void addItem(int itemId, int quantity) {
        int currentQuantity = items.getOrDefault(itemId, 0);
        items.put(itemId, currentQuantity + quantity);
    }

    public void removeItem(int itemId, int quantity) {
        int currentQuantity = items.getOrDefault(itemId, 0);
        int newQuantity = currentQuantity - quantity;
        if (newQuantity <= 0) {
            items.remove(itemId);
        } else {
            items.put(itemId, newQuantity);
        }
    }

    public Map<Integer, Integer> getItems() {
        return items;
    }

    public void clear() {
        items.clear();
    }
}