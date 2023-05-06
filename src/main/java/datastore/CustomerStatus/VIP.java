package datastore.CustomerStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Getter;
import lombok.Setter;


@XmlAccessorType(XmlAccessType.FIELD)
@Setter @Getter
public class VIP extends Member {

    private static final double DISCOUNT_RATE_VIP = 0.1;

    public VIP() {
        super();
    }

    public VIP(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
    }

    @Override
    public double applyPoints(double amount) {
        double discount = super.applyPoints(amount);
        double fixedDiscount = amount * DISCOUNT_RATE_VIP;
        return discount + fixedDiscount;
    }
}
