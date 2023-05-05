package datastore;

import java.util.*;
import javax.xml.bind.*;

public class Main3 {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Manager("Bob", 40, "Sales"));

        DataAdapter adapter = new XmlDataAdapter2();
        String path = "data.xml";
        adapter.saveData(path, employees);

        List<?> loadedData = adapter.loadData(path);
        List<Employee> loadedEmployees = new ArrayList<>();
        List<Manager> loadedManagers = new ArrayList<>();

        for (Object obj : loadedData) {
            if (obj instanceof Employee) {
                loadedEmployees.add((Employee) obj);
            }
            if (obj instanceof Manager) {
                loadedManagers.add((Manager) obj);
            }
        }

        System.out.println("Loaded " + loadedEmployees.size() + " employees:");
        for (Employee emp : loadedEmployees) {
            System.out.println(emp.getName() + " (" + emp.getAge() + ")");
        }

        System.out.println("Loaded " + loadedManagers.size() + " managers:");
        for (Manager mgr : loadedManagers) {
            System.out.println(mgr.getName() + " (" + mgr.getAge() + "), " + mgr.getDepartment());
        }

    }
}

