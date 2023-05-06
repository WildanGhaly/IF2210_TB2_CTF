package customer;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a customer with an ID, loyalty points, and total amount spent.
 * 
 * <p>
 * Customers can accumulate points and spend money to increase their loyalty status.
 * They can also be subclassed into more specific types of customers, such as VIPs.
 * </p>
 * @author<u1>@WildanGhaly</u>
 * @see Member
 * @see VIP
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Member.class, VIP.class})
@Setter @Getter
public class Customer implements Serializable {

    /** The unique identifier for this customer. */
    private int id;

    /** The number of loyalty points this customer has. */
    protected int points;

    /** The total amount of money this customer has spent. */
    private double totalSpent;

    /**
     * Default constructor for JAXB.
     */
    public Customer(){}

    /**
     * Creates a new customer with the specified ID and no points or spending history.
     * @param id the unique identifier for this customer
     */
    public Customer(int id) {
        this.id = id;
        this.points = 0;
        this.totalSpent = 0;
    }

    /**
     * Creates a new customer with the specified ID, points, and spending history.
     * @param id the unique identifier for this customer
     * @param points the number of loyalty points this customer has
     * @param totalSpent the total amount of money this customer has spent
     */
    public Customer(int id, int points, double totalSpent){
        this.id = id;
        this.points = points;
        this.totalSpent = totalSpent;
    }

    /**
     * Adds the specified amount to this customer's total spending.
     * @param orderAmount the amount of money spent in the latest order
     */
    public void addOrder(double orderAmount) {
        this.totalSpent += orderAmount;
    }

}