import java.util.Scanner;
public class Main {
    enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED,
    }

    enum ShippingStatus {
        STANDARD,
        TWO_DAY,
        OVERNIGHT
    }


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the shopping cart app!");

        System.out.print("Are you tax-exempt? (y/n)");
        String taxExempt = console.nextLine();

        System.out.print("Shipping? (y/n)");
        String ship = console.nextLine();

        System.out.print("Order quantity?");
        String quantity = console.nextLine();

        System.out.print("Promo code for free shipping?");
        String promo = console.nextLine();

        System.out.println("Details:");
        System.out.println("Tax-exempt: " + taxExempt);
        System.out.println("Shipping: " + ship);
        System.out.println("Order quantity: " + quantity);
        System.out.println("Promo code: " + promo);

        String businessName = "Zebra Goods";
        String contactInformation = "512-555-5555";
        String itemDescription = "My product description";

        System.out.println("Business name: " + businessName);
        System.out.println("Business contact info: " + contactInformation);
        System.out.println("Product description: " + itemDescription);
        int productId = 1;
        int productCategory = 2;
        double productCost = 2.56;
        double productPrice = 4.99;
        int productQuantity = 78;
        // total cost of product based on inventory
        double totalCost = productCost * productQuantity;
        System.out.println("Total Cost: " + totalCost);
        // profit in dollars
        double profitPerProduct = productPrice - productCost;
        System.out.println("Profit in dollars: " + profitPerProduct);

        //total potential profit
        double totaProfit = profitPerProduct * productQuantity;
        System.out.println("Total Profit: " + totaProfit);
        //  Enum shipping
        OrderStatus status = OrderStatus.PROCESSING;
        ShippingStatus Shipping = ShippingStatus.TWO_DAY;
        OrderStatus[] numStatus = OrderStatus.values();
        OrderStatus pending = numStatus[0];
        ShippingStatus[] numShipping = ShippingStatus.values();
        ShippingStatus standard = numShipping[0];

        System.out.println(ShippingStatus.STANDARD);
        System.out.println(ShippingStatus.TWO_DAY);
        System.out.println(ShippingStatus.OVERNIGHT);
        OrderStatus orderStatus = OrderStatus.PROCESSING;
        System.out.println("Order Status: " + orderStatus);

        System.out.println(OrderStatus.PENDING);
        System.out.println(OrderStatus.PROCESSING);
        System.out.println(OrderStatus.SHIPPED);
        System.out.println(OrderStatus.DELIVERED);
        ShippingStatus shipStatus = ShippingStatus.TWO_DAY;
        System.out.println("Shipping: " + shipStatus);

       // System.out.println(pending);
        // System.out.println(standard);
        //System.out.println("Thank you for your purchased! Your order is currently: " + status);
        //System.out.println("You choose: " + Shipping + " shipping.");

    }
}