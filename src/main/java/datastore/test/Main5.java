package datastore.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import customer.Member;
import customer.VIP;
import datastore.DataAdapter;
import datastore.JsonDataAdapter;
import datastore.ObjDataAdapter;
import datastore.XmlDataAdapter;
import sistemusahabarang.Barang;
import sistemusahabarang.History;

/**
 * <p>
 * This class tests the <strong>DataAdapter interface</strong> using three different implementations: {@code XmlDataAdapter},
 * {@code JsonDataAdapter}, and {@code ObjDataAdapter}. The tested classes are {@code Customer}, {@code Member}, {@code VIP}, and {@code Barang}.
 * </p>
 * <p>
 * The goal of the test is to save and load data from files in three different formats: <strong>XML, JSON, and OBJ</strong>.
 * The data is saved in twelve different files, including customer.xml, customer.json, customer.obj,
 * member.xml, member.json, member.obj, vip.xml, vip.json, vip.obj, barang.xml, barang.json, and barang.obj.
 * </p>
 * <p>
 * The loaded data is printed to the console, and the saved data is also printed to the console for verification.
 * </p>
 * <p>
 * @author:@WildanGhaly
 * </p>
 */
public class Main5 {
    
    public static void main(String[] args) {

        final String LOCATE                 = "src/main/java/datastore/database/";
        final String CUSTOMER               = "Customer/customer";
        final String MEMBER                 = "Member/member";
        final String BARANG                 = "Barang/barang";
        final String VIP                    = "VIP/vip";
        final String HISTORY                = "History/history";
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

        final String HISTORY_FILE_JSON      = LOCATE + HISTORY + JSON;
        final String HISTORY_FILE_XML       = LOCATE + HISTORY + XML;
        final String HISTORY_FILE_OBJ       = LOCATE + HISTORY + OBJ;

        List<Customer> customers = new ArrayList<>();
        List<Customer> members = new ArrayList<>();
        List<Customer> vips = new ArrayList<>();
        List<Barang> barangs = new ArrayList<>();
        List<History> histories = new ArrayList<>();

        customers.add(new Customer(1));
        customers.add(new Customer(2));
        customers.add(new Customer(3));

        members.add(new Member(4, "Willy", "1234567890"));
        members.add(new Member(5, "Wildan", "32422222222"));
        members.add(new Member(6, "Ghaly", "00000000000"));

        vips.add(new VIP(7, "WillyVIP", "1234567890"));
        vips.add(new VIP(8, "WildanVIP", "32422222222"));
        vips.add(new VIP(9, "GhalyVIP", "00000000000"));

        barangs.add(new Barang(0, 2, "Baju", 100_000, 50_000, "Pakaian", "baju.com"));
        barangs.add(new Barang(1, 3, "Celana", 200_000, 100_000, "Pakaian", "celana.com"));
        barangs.add(new Barang(2, 4, "Sepatu", 300_000, 150_000, "Pakaian", "sepatu.com"));

        histories.add(new History(1, "Willy", "Ayam Goreng", LocalDate.now().toString(), 2, 5000, 10000));
        histories.add(new History(1, "Willy", "Ayam Bakar", LocalDate.now().toString(), 3, 5000, 15000));
        histories.add(new History(2, "Wildan", "Ayam Geprek", LocalDate.now().toString(), 4, 3000, 12000));

        DataAdapter adapterJSON     = new JsonDataAdapter();
        DataAdapter adapterXML      = new XmlDataAdapter();
        DataAdapter adapterOBJ      = new ObjDataAdapter();


        /* Save in JSON */

        try {
            adapterJSON.saveData(CUSTOMER_FILE_JSON, customers);
            adapterJSON.saveData(MEMBER_FILE_JSON, members);
            adapterJSON.saveData(VIP_FILE_JSON, vips);
            adapterJSON.saveData(BARANG_FILE_JSON, barangs);
            adapterJSON.saveData(HISTORY_FILE_JSON, histories);
            adapterJSON.addData(BARANG_FILE_JSON, new Barang(3, 5, "Kemeja", 400_000, 200_000, "Pakaian", "kemeja.com"));
            adapterJSON.addData(MEMBER_FILE_JSON, new Member(10, "WildanGhaly", "1234567890"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Save in XML */

        try {
            adapterXML.saveData(CUSTOMER_FILE_XML, customers);
            adapterXML.saveData(MEMBER_FILE_XML, members);
            adapterXML.saveData(VIP_FILE_XML, vips);
            adapterXML.saveData(BARANG_FILE_XML, barangs);
            adapterXML.saveData(HISTORY_FILE_XML, histories);
            adapterXML.addData(BARANG_FILE_XML, new Barang(4, 5, "Kemeja", 400_000, 200_000, "Pakaian", "kemeja.com"));
            adapterXML.addData(MEMBER_FILE_XML, new Member(10, "WildanGhaly", "1234567890"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Save in OBJ */
        
        try {
            adapterOBJ.saveData(CUSTOMER_FILE_OBJ, customers);
            adapterOBJ.saveData(MEMBER_FILE_OBJ, members);
            adapterOBJ.saveData(VIP_FILE_OBJ, vips);
            adapterOBJ.saveData(BARANG_FILE_OBJ, barangs);
            adapterOBJ.saveData(HISTORY_FILE_OBJ, histories);
            adapterOBJ.addData(BARANG_FILE_OBJ, new Barang(5, 5, "Kemeja", 400_000, 200_000, "Pakaian", "kemeja.com"));
            adapterOBJ.addData(MEMBER_FILE_OBJ, new Member(10, "WildanGhaly", "1234567890"));
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

        loadedData = null;

        try {
            loadedData = adapterJSON.loadData(HISTORY_FILE_JSON);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load JSON success\n");


        /* Load from XML */
        
        loadedData = null;
        List<Customer>  loadedCustomersXML     = new ArrayList<>();
        List<Member>    loadedMembersXML       = new ArrayList<>();
        List<VIP>       loadedVIPXML           = new ArrayList<>();

        try {
            loadedData = adapterXML.loadData(CUSTOMER_FILE_XML);
            for (Object obj : loadedData){
                loadedCustomersXML.add((Customer) obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterXML.loadData(MEMBER_FILE_XML);
            for (Object obj : loadedData){
                loadedMembersXML.add((Member) obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterXML.loadData(VIP_FILE_XML);
            for (Object obj : loadedData){
                loadedVIPXML.add((VIP) obj);
            }
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

        loadedData = null;

        try {
            loadedData = adapterXML.loadData(HISTORY_FILE_XML);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load XML success\n");


        /* Load from OBJ */
        
        loadedData = null;
        List<Customer>  loadedCustomersOBJ     = new ArrayList<>();
        List<Member>    loadedMembersOBJ       = new ArrayList<>();
        List<VIP>       loadedVIPOBJ           = new ArrayList<>();

        try {
            loadedData = adapterOBJ.loadData(CUSTOMER_FILE_OBJ);
            for (Object obj : loadedData){
                loadedCustomersOBJ.add((Customer) obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(MEMBER_FILE_OBJ);
            for (Object obj : loadedData){
                loadedMembersOBJ.add((Member) obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(VIP_FILE_OBJ);
            for (Object obj : loadedData){
                loadedVIPOBJ.add((VIP) obj);
            }
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

        loadedData = null;

        try {
            loadedData = adapterOBJ.loadData(HISTORY_FILE_OBJ);
            System.out.println(loadedData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Load OBJ success\n");

        System.out.println("\n\nThe result of XML:");
        for (Customer cust : loadedCustomersXML){
            System.out.println("Customer: " + cust.getId() + " || " + cust.getPoints() + " || " + cust.getTotalSpent());
        }
        for (Member memb : loadedMembersXML){
            System.out.println("Member: " + memb.getId() + " || " + memb.getPoints() + " || " + memb.getTotalSpent() + " || " + memb.getName() + " || " + memb.getPhoneNumber());
        }
        for (VIP vip : loadedVIPXML){
            System.out.println("VIP: " + vip.getId() + " || " + vip.getPoints() + " || " + vip.getTotalSpent() + " || " + vip.getName() + " || " + vip.getPhoneNumber() + " || ");
        }

        System.out.println("\n\nThe result of OBJ:");
        for (Customer cust : loadedCustomersOBJ){
            System.out.println("Customer: " + cust.getId() + " || " + cust.getPoints() + " || " + cust.getTotalSpent());
        }
        for (Member memb : loadedMembersOBJ){
            System.out.println("Member: " + memb.getId() + " || " + memb.getPoints() + " || " + memb.getTotalSpent() + " || " + memb.getName() + " || " + memb.getPhoneNumber());
        }
        for (VIP vip : loadedVIPOBJ){
            System.out.println("VIP: " + vip.getId() + " || " + vip.getPoints() + " || " + vip.getTotalSpent() + " || " + vip.getName() + " || " + vip.getPhoneNumber() + " || ");
        }
    }
}
