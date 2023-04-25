/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author user
 */

@Getter @Setter
public class Pelanggan {
    public static @Getter Integer totalPelanggan = 0;
    private @Getter @Setter String nama;
    private @Getter @Setter String status;
    private final @Getter Integer id;

    public Pelanggan(){
        this.id = totalPelanggan+1;
        this.nama = "";
        this.status = "";
        totalPelanggan++;
    }

    public Pelanggan(String nama, String status){
        this.id = totalPelanggan+1;
        this.nama = nama;
        this.status = status;
        totalPelanggan++;
    }
}