package customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a member customer, subclass of {@link Customer}, with a name, phone number,
 * and additional features such as loyalty points and discount rates.
 * <p>
 * Members have a discount rate and earn loyalty points based on the amount of money spent on orders.
 * They can also apply their points as discounts on future orders.
 * </p>
 * @author<u1>@WildanGhaly</u>
 * @see Customer
 * @see VIP
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({VIP.class})
@Setter @Getter
public class Member extends Customer {

    /** The discount rate for members, as a decimal value. */
    private static final double DISCOUNT_RATE_MEMBER = 0.01;
    
    /** The name of this member. */
    private String name;

    /** The phone number of this member. */
    private String phoneNumber;

    /**
     * Default constructor for JAXB.
     */
    public Member() {
        super();
    }

    /**
     * Creates a new member with the specified ID, name, and phone number.
     * @param id the unique identifier for this member
     * @param name the name of this member
     * @param phoneNumber the phone number of this member
     */
    public Member(int id, String name, String phoneNumber) {
        super(id);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Adds the specified amount to this member's total spending and updates the loyalty points.
     * @param orderAmount the amount of money spent in the latest order
     */
    @Override
    public void addOrder(double orderAmount) {
        super.addOrder(orderAmount);
        int newPoints = (int) (orderAmount * DISCOUNT_RATE_MEMBER);
        this.points += newPoints;
    }

    /**
     * Applies the member's loyalty points as a discount on the specified amount, up to the maximum
     * amount of points available.
     * @param amount the amount to apply the discount to
     * @return the total amount of the discount applied
     */
    public double applyPoints(double amount) {
        double discount = Math.min(amount, this.points);
        this.points -= discount;
        return discount;
    }
}