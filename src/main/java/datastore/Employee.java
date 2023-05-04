package datastore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Manager.class})
@Setter @Getter
public class Employee {
    private String name;
    private int age;

    public Employee() {}
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}