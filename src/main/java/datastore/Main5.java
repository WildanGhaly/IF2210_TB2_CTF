package datastore;

import java.util.ArrayList;
import java.util.List;

import datastore.CustomerStatus.Customer;
import datastore.CustomerStatus.Member;
import datastore.CustomerStatus.VIP;

import datastore.Item.Barang;

public class Main5 {
    
    public static void main(String[] args) {

        final String LOCATE                 = "src/main/java/datastore/database/";
        final String CUSTOMER               = "Customer/customer";
        final String MEMBER                 = "Member/member";
        final String BARANG                 = "Barang/barang";
        final String VIP                    = "VIP/vip";
        final String JSON                   = ".json";
        final String XML                    = ".xml";
        final String OBJ                    = ".obj";

        final String CUSTOMER_FILE_JSON     = LOCATE + CUSTOMER + JSON;
        final String CUSTOMER_FILE_XML      = LOCATE + CUSTOMER + XML;
        final String CUSTOMER_FILE_OBJ      = LOCATE + CUSTOMER + OBJ;

        final String MEMBER_FILE_JSON       = LOCATE + MEMBER + JSON;
        final String MEMBER_FILE_XML        = LOCATE + MEMBER + XML;
        final String MEMBER_FILE_OBJ        = LOCATE + MEMBER + OBJ;

        final String VIP_FILE_JSON          = LOCATE + VIP + JSON;
        final String VIP_FILE_XML           = LOCATE + VIP + XML;
        final String VIP_FILE_OBJ           = LOCATE + VIP + OBJ;

        final String BARANG_FILE_JSON       = LOCATE + BARANG + JSON;
        final String BARANG_FILE_XML        = LOCATE + BARANG + XML;
        final String BARANG_FILE_OBJ        = LOCATE + BARANG + OBJ;

        List<Customer> customers = new ArrayList<>();
        List<Customer> members = new ArrayList<>();
        List<Customer> vips = new ArrayList<>();
        List<Barang> barangs = new ArrayList<>();

        customers.add(new Customer(1));
        customers.add(new Customer(2));
        customers.add(new Customer(3));

        members.add(new Member(4, "Willy", "1234567890"));
        members.add(new Member(5, "Wildan", "32422222222"));
        members.add(new Member(6, "Ghaly", "00000000000"));

        vips.add(new VIP(7, "WillyVIP", "1234567890"));
        vips.add(new VIP(8, "WildanVIP", "32422222222"));
        vips.add(new VIP(9, "GhalyVIP", "00000000000"));

        barangs.add(new Barang(2, "Baju", 100_000, 50_000, "Pakaian", "baju.com"));
        barangs.add(new Barang(3, "Celana", 200_000, 100_000, "Pakaian", "celana.com"));
        barangs.add(new Barang(4, "Sepatu", 300_000, 150_000, "Pakaian", "sepatu.com"));

        DataAdapter adapterJSON = new JsonDataAdapter();
        DataAdapter adapterXML = new XmlDataAdapter();
        DataAdapter adapterOBJ = new ObjDataAdapter();

        /* Save in JSON */
        try {
            adapterJSON.saveData(CUSTOMER_FILE_JSON, customers);
            adapterJSON.saveData(MEMBER_FILE_JSON, members);
            adapterJSON.saveData(VIP_FILE_JSON, vips);
            adapterJSON.saveData(BARANG_FILE_JSON, barangs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Save in XML */
        try {
            adapterXML.saveData(CUSTOMER_FILE_XML, customers);
            adapterXML.saveData(MEMBER_FILE_XML, members);
            adapterXML.saveData(VIP_FILE_XML, vips);
            adapterXML.saveData(BARANG_FILE_XML, barangs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Save in OBJ */
        try {
            adapterOBJ.saveData(CUSTOMER_FILE_OBJ, customers);
            adapterOBJ.saveData(MEMBER_FILE_OBJ, members);
            adapterOBJ.saveData(VIP_FILE_OBJ, vips);
            adapterOBJ.saveData(BARANG_FILE_OBJ, barangs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Save success\n\n");

        List<?> loadedData = null;


        /* Load from JSON */

        try {
            loadedData = adapterJSON.loadData(CUSTOMER_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterJSON.loadData(MEMBER_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterJSON.loadData(VIP_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterJSON.loadData(BARANG_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load JSON success\n");


        /* Load from XML */
        
        loadedData = null;

        try {
            loadedData = adapterXML.loadData(CUSTOMER_FILE_XML);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterXML.loadData(MEMBER_FILE_XML);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterXML.loadData(VIP_FILE_XML);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterXML.loadData(BARANG_FILE_XML);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load XML success\n");


        /* Load from OBJ */
        
        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(CUSTOMER_FILE_OBJ);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(MEMBER_FILE_OBJ);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(VIP_FILE_OBJ);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(BARANG_FILE_OBJ);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load OBJ success\n");
    }

}
