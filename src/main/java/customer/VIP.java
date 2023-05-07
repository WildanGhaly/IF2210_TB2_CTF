package customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a VIP member customer, subclass of {@link Member}, with an additional discount rate.
 * <p>
 * VIP members have a higher discount rate than regular members and can also apply their loyalty points
 * as discounts on future orders, with an additional fixed discount applied on top of the points.
 * </p>
 * @author<u1>@WildanGhaly</u>
 * @see Member
 * @see Customer
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Setter @Getter
public class VIP extends Member {

    /** The discount rate for VIP members, as a decimal value. */
    private static final double DISCOUNT_RATE_VIP = 0.1;

    /* To define if this is vip */
    private int vipMember = 1;

    /**
     * Default constructor for JAXB.
     */
    public VIP() {
        super();
    }

    /**
     * Creates a new VIP member with the specified ID, name, and phone number.
     * @param id the unique identifier for this VIP member
     * @param name the name of this VIP member
     * @param phoneNumber the phone number of this VIP member
     */
    public VIP(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
    }

    /**
     * Creates a new VIP member with the specified ID, points, total spending, name, and phone number.
     * @param id the unique identifier for this VIP member
     * @param points the number of loyalty points this VIP member has
     * @param totalSpent the total amount of money this VIP member has spent
     * @param name the name of this VIP member
     * @param phoneNumber the phone number of this VIP member
     */
    public VIP(int id, int points, double totalSpent, String name, String phoneNumber){
        super(id, points, totalSpent, name, phoneNumber);
    }

    /**
     * Applies the member's loyalty points as a discount on the specified amount, up to the maximum
     * amount of points available, and adds a fixed discount based on the VIP discount rate.
     * @param amount the amount to apply the discount to
     * @return the total amount of the discount applied
     */
    @Override
    public double applyPoints(double amount) {
        double discount = super.applyPoints(amount);
        double fixedDiscount = amount * DISCOUNT_RATE_VIP;
        return discount + fixedDiscount;
    }

    public static void main(String[] args) {
        VIP vip = new VIP(1,100,1000, "Wildan", "12345678");
        double discount = vip.applyPoints(1_000);
        vip.addOrder(1_000  - discount);
        System.out.println(vip.getTotalSpent());
        System.out.println(vip.getPoints());
    }
}
