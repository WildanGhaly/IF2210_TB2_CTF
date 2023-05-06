package datastore.test;

import java.util.*;

import customer.Customer;
import customer.Member;
import customer.VIP;
import datastore.DataAdapter;
import datastore.XmlDataAdapter2;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(30));
        customers.add(new Member(40, "Willy", "000Sales"));
        customers.add(new VIP(20, "Wildan", "+62812345678"));

        DataAdapter adapter = new XmlDataAdapter2();
        String path = "data.xml";
        adapter.saveData(path, customers);

        List<?> loadedData = adapter.loadData(path);
        List<Customer>  loadedCustomers     = new ArrayList<>();
        List<Member>    loadedMembers       = new ArrayList<>();
        List<VIP>       loadedVIP           = new ArrayList<>();

        for (Object obj : loadedData) {
            if (obj instanceof Customer) {
                loadedCustomers.add((Customer) obj);
            }
            if (obj instanceof Member) {
                loadedMembers.add((Member) obj);
            }
            if (obj instanceof VIP) {
                loadedVIP.add((VIP) obj);
            }
        }

        System.out.println("Loaded " + loadedCustomers.size() + " customers:");
        for (Customer cust : loadedCustomers) {
            System.out.println(cust.getId() + " (" + cust.getPoints() + ")" + cust.getTotalSpent());
        }

        System.out.println("Loaded " + loadedMembers.size() + " Members:");
        for (Member memb : loadedMembers) {
            System.out.println(memb.getName() + " (" + memb.getPhoneNumber() + "), " + memb.getId() + " (" + memb.getPoints() + ") " + memb.getTotalSpent());
        }

        System.out.println("Loaded " + loadedVIP.size() + " VIPs");
        for (VIP vips : loadedVIP) {
            System.out.println(vips.getName() + " (" + vips.getPhoneNumber() + "), " + vips.getId() + " (" + vips.getPoints() + ") " + vips.getTotalSpent());
        }

    }
}
