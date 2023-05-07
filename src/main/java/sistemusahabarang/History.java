package sistemusahabarang;

import java.io.Serializable;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * The <code>History</code> class represents a history of a transaction.
 * This class implements the <code>Serializable</code> interface and uses JAXB annotations to allow it to be read by various data adapter classes,
 * including XmlDataAdapter, JsonDataAdapter, and ObjDataAdapter.
 * <p>Attributes:</p>
 * <ul>
 * <li><code>nama</code> - a string representing the name of the user who made the transaction</li>
 * <li><code>namaBarang</code> - a string representing the name of the item that was purchased</li>
 * <li><code>tanggal</code> - a string representing the date on which the transaction was made</li>
 * <li><code>kuantitas</code> - an integer value representing the number of units of the item that were purchased</li>
 * <li><code>harga</code> - a double value representing the price at which the item was purchased</li>
 * <li><code>total</code> - a double value representing the total price of the transaction</li>
 * </ul>
 * <p>This class is intended to be used as a data model for representing transactions in a retail system, and can be used to store and retrieve information about transactions
 * in a database or other data storage mechanism. It can be serialized and deserialized using various data adapters, which allow it to be used in a variety of
 * contexts and technologies.</p>
 * <p>It is important to note that this class does not contain any information about the item that was purchased, only the name of the item. This is because
 * the item's information is stored in a separate <code>Barang</code> object, and the <code>History</code> class is only used to store information about the transaction itself.</p>
 * <p>It is also important to note that the <code>tanggal</code> attribute is stored as a string, not a <code>LocalDate</code> object. This is because the <code>LocalDate</code>
 * class is not serializable, and therefore cannot be used in a data model that is intended to be serialized and deserialized.</p>
 * @author<strong>@WildanGhaly</strong>
 * @see Serializable
 * @see XmlRootElement
 * @see XmlAccessorType
 * @see Data
 * @see Getter
 * @see Setter
 * @see LocalDate
 * @see Barang
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Setter @Getter
public class History implements Serializable {
    private String nama;
    private String namaBarang;
    private String tanggal;
    private int kuantitas;
    private double harga;
    private double total;

    /**
     * Creates a new <code>History</code> object with default attributes.
     * @see History
     */
    public History(){}

    /**
     * Creates a new <code>History</code> object with the specified attributes.
     * @param nama - a string representing the name of the user who made the transaction
     * @param namaBarang - a string representing the name of the item that was purchased
     * @param tanggal - a string representing the date on which the transaction was made
     * @param kuantitas - an integer value representing the number of units of the item that were purchased
     * @param harga - a double value representing the price at which the item was purchased
     * @param total - a double value representing the total price of the transaction
     * @see History
     */
    public History(String nama, String namaBarang, String tanggal, int kuantitas, double harga, double total) {
        this.nama  = nama;
        this.namaBarang = namaBarang;
        this.tanggal = tanggal;
        this.kuantitas = kuantitas;
        this.harga = harga;
        this.total = total;
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.toString());
    }
}