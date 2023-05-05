package datastore.CustomerStatus;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer implements Serializable{

    private int id;
    protected int points;
    private double totalSpent;

    public Customer(){}

    public Customer(int id) {
        this.id = id;
        this.points = 0;
        this.totalSpent = 0;
    }

    public void addOrder(double orderAmount) {
        this.totalSpent += orderAmount;
    }

}