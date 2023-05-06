package sistemusahabarang;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Barang implements Serializable {
    private int stock;
    private String name;
    private double sellPrice;
    private double buyPrice;
    private String kategori;
    private String image;

    public Barang() {}

    public Barang(int stock, String name, double sellPrice, double buyPrice, String kategori, String image) {
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
