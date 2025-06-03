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

        String businessName = "Zebra Goods";
//        String contactInformation = "512-555-5555";
//        String itemDescription = "My product description";
//        System.out.println("Business name: " + businessName);
//        System.out.println("Business contact info: " + contactInformation);
//        System.out.println("Product description: " + itemDescription);
        System.out.println("Welcome to the shopping cart app!");
        int productId = 1;
        int productCategory = 2;
        double productCost = 2.56;
        double productPrice = 4.99;
        int productQuantity = 78;


        boolean isConfirmed = false;
//        String taxExempt ="";
//        String Shipping = "";
//        String promoCode = "";
//        int orderQuanity = 0;

        System.out.print("Are you tax-exempt? (y/n)");
        String taxExempt = console.nextLine();

        System.out.print("Shipping? (Standard/ overnight/ two-day) ");
        String ship = console.nextLine();

        System.out.print("Order quantity?");
        String quantity = console.nextLine();

        System.out.print("Promo code for free shipping?");
        String promo = console.nextLine();

        while (!isConfirmed) {

//        System.out.println("Product price: " + productPrice);
//


        System.out.println("Details:");
        System.out.println("Tax-exempt: " + taxExempt);
        System.out.println("Shipping: " + ship);
        System.out.println("Order quantity: " + quantity);
        System.out.println("Promo code: " + promo);

            System.out.print("Confirm oder y/n: ");
            String Confirmed = console.nextLine();
            if(Confirmed.equals("y")){
                break;
            }else {
                continue;
            }
        }
//
//
//        double taxRate = 0.07; // In percentage
//        double standardShipping = 2.00;
//        double twoDayShipping = 5.00;
//        double overnightShipping = 10.00;
//
//        double hundredDollarDiscount = 0.05;
//        double fiveHundredDollarDiscount = 0.10;
//        // total cost of product based on inventory
//        double totalCost = productCost * productQuantity;
//        System.out.println("Total Cost: " + totalCost);
//        // profit in dollars
//        double profitPerProduct = productPrice - productCost;
//        System.out.println("Profit in dollars: " + profitPerProduct);
//
//        //total potential profit
//        double totaProfit = profitPerProduct * productQuantity;
//        System.out.println("Total Profit: " + totaProfit);
//
//        //tax cost applied
//        if (taxExempt.equals("n")) {
//            totalCost = totalCost + (totalCost * totalCost);
//        }
//        System.out.println("Total w/ tax: " + totalCost);
//
//        //order total discount
//        if (totalCost >= 500) {
//            totalCost = totalCost - (totalCost * fiveHundredDollarDiscount);
//        } else if (totalCost >=  100) {
//            totalCost = totalCost - (totalCost * hundredDollarDiscount);
//        }
//        System.out.println("Total after discount: " + totalCost);
//
//        double shippingCost = 0.00;
//        switch (ship) {
//            case "standard":
//                shippingCost = standardShipping;
//                if (promo.equals("FREE")) {
//                    shippingCost = 0;
//                }
//                break;
//
//            case "overnight":
//                shippingCost = overnightShipping;
//                break;
//
//            case "twoday":
//                shippingCost = twoDayShipping;
//                break;
//
//            default:
//                // invalid input
//                System.out.println("Invalid shipping type");
//
//        }
//        totalCost += shippingCost;
//        System.out.println("Shipping Cost: " + shippingCost);
//        System.out.println("Final Total: " + totalCost);
//
//
//        //  Enum shipping
//        OrderStatus status = OrderStatus.PROCESSING;
//        ShippingStatus Shipping = ShippingStatus.TWO_DAY;
//        OrderStatus[] numStatus = OrderStatus.values();
//        OrderStatus pending = numStatus[0];
//        ShippingStatus[] numShipping = ShippingStatus.values();
//        ShippingStatus standard = numShipping[0];
//
//        System.out.println(ShippingStatus.STANDARD);
//        System.out.println(ShippingStatus.TWO_DAY);
//        System.out.println(ShippingStatus.OVERNIGHT);
//        OrderStatus orderStatus = OrderStatus.PROCESSING;
//        System.out.println("Order Status: " + orderStatus);
//
//        System.out.println(OrderStatus.PENDING);
//        System.out.println(OrderStatus.PROCESSING);
//        System.out.println(OrderStatus.SHIPPED);
//        System.out.println(OrderStatus.DELIVERED);
//        ShippingStatus shipStatus = ShippingStatus.TWO_DAY;
//        System.out.println("Shipping: " + shipStatus);


    }
}