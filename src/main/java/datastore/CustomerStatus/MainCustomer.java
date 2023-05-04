package datastore.CustomerStatus;

public class MainCustomer {
    public static void main(String[] args) {
        // Create new customer with id 1
        Customer customer = new Customer(1);

        // Add new order
        double orderAmount = 10_000_000;
        customer.addOrder(orderAmount);

        // Upgrade customer to member if total spending is above threshold
        if (customer.getTotalSpent() >= 1_000_000) {
            // Register customer as member
            String name = "Willy";
            String phoneNumber = "+622222222222";
            Member member = new Member(customer.getId(), name, phoneNumber);

            member.addOrder(orderAmount);

            // Apply points to get discount
            double discount = member.applyPoints(orderAmount);

            // Print discount amount and remaining points
            System.out.println("Discount: " + discount);
            System.out.println("Remaining points: " + member.getPoints());

            // Upgrade member to VIP if total spending is above threshold
            if (member.getTotalSpent() >= 5_000_000) {
                // Register member as VIP
                VIP vip = new VIP(member.getId(), member.getName(), member.getPhoneNumber());

                vip.addOrder(orderAmount);

                // Apply points to get discount
                double fixedDiscount = vip.applyPoints(orderAmount);

                // Print discount amount and remaining points
                System.out.println("Fixed discount: " + fixedDiscount);
                System.out.println("Remaining points: " + vip.getPoints());
            }

            // Deactivate member status
            member = null;

            // Reactivate member status
            String name2 = "Wildan Ghaly";
            String phoneNumber2 = "+628888888";
            member = new Member(customer.getId(), name2, phoneNumber2);
        }

        
    }
}
