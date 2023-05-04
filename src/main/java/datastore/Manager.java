package datastore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@Setter @Getter
public class Manager extends Employee {
    private String department;

    public Manager() {}
    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

}
