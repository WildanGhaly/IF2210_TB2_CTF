package sistemusahabarang;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Barang implements Serializable {
    private int id;
    private int stock;
    private String name;
    private double sellPrice;
    private double buyPrice;
    private String kategori;
    private String image;

    public Barang() {}

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
