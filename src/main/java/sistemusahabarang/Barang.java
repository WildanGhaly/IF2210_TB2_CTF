package sistemusahabarang;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * The <code>Barang</code> class represents an item that has various attributes such as its ID, stock, name, sell price, buy price, category, and image.
 * This class implements the <code>Serializable</code> interface and uses JAXB annotations to allow it to be read by various data adapter classes,
 * including XmlDataAdapter, JsonDataAdapter, and ObjDataAdapter.
 * <p>Attributes:</p>
 * <ul>
 * <li><code>id</code> - an integer value representing the unique identifier for this item</li>
 * <li><code>stock</code> - an integer value representing the number of available units of this item in stock</li>
 * <li><code>name</code> - a string representing the name of this item</li>
 * <li><code>sellPrice</code> - a double value representing the price at which this item can be sold</li>
 * <li><code>buyPrice</code> - a double value representing the price at which this item was purchased</li>
 * <li><code>kategori</code> - a string representing the category to which this item belongs</li>
 * <li><code>image</code> - a string representing the file path to the image associated with this item</li>
 * </ul>
 * <p>This class is intended to be used as a data model for representing items in a retail system, and can be used to store and retrieve information about items 
 * in a database or other data storage mechanism. It can be serialized and deserialized using various data adapters, which allow it to be used in a variety of
 * contexts and technologies.</p>
 * @author<strong>@WildanGhaly</strong>
 * @see Serializable
 * @see XmlRootElement
 * @see XmlAccessorType
 * @see XmlAccessType
 * @see DataAdapter
 * @see XmlDataAdapter
 * @see JsonDataAdapter
 * @see ObjDataAdapter
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Setter@Getter
public class Barang implements Serializable {
    private int id;
    private int stock;
    private String name;
    private double sellPrice;
    private double buyPrice;
    private String kategori;
    private String image;

    /**
     * Constructs a new Barang object with default values for all attributes.
     * @see Barang
     */
    public Barang() {}

    /**
     * Constructs a new Barang object with the specified values for all attributes.
     * @param id the unique identifier for this item
     * @param stock the number of available units of this item in stock
     * @param name the name of this item
     * @param sellPrice the price at which this item can be sold
     * @param buyPrice the price at which this item was purchased
     * @param kategori the category to which this item belongs
     * @param image the file path to the image associated with this item
     */
    public Barang(int id, int stock, String name, double sellPrice, double buyPrice, String kategori, String image) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.kategori = kategori;
        this.image = image;
    }

    // Implementasi operasi CRUD
    public void addStock(int jumlah) {
        stock += jumlah;
    }

    public void subtractStock(int jumlah) {
        if (jumlah > stock) {
            throw new IllegalArgumentException("stock tidak cukup!");
        }
        stock -= jumlah;
    }

}
