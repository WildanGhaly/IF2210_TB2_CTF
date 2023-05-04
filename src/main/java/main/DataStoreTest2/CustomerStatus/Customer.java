package main.DataStoreTest2.CustomerStatus;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

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

    public int getId() {
        return id;
    }

    public void addOrder(double orderAmount) {
        this.totalSpent += orderAmount;
    }

    public int getPoints() {
        return points;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }
}