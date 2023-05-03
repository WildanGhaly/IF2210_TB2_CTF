package datastore.CustomerStatus;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member extends Customer {

    private static final double DISCOUNT_RATE_MEMBER = 0.01;
    
    private String name;
    private String phoneNumber;

    public Member() {
        super();
    }

    public Member(int id, String name, String phoneNumber) {
        super(id);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void addOrder(double orderAmount) {
        super.addOrder(orderAmount);
        int newPoints = (int) (orderAmount * DISCOUNT_RATE_MEMBER);
        this.points += newPoints;
    }

    public double applyPoints(double amount) {
        double discount = Math.min(amount, this.points);
        this.points -= discount;
        return discount;
    }
}