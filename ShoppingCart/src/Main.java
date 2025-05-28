public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart app!");
        int productId = 1;
        int productCategory = 2;
        double productCost = 2.56;
        double productPrice = 4.99;
        int productQuantity = 78;
            // total cost of product based on inventory
        double  totalCost = productCost * productQuantity;
        System.out.println("Total Cost: " + totalCost);
            // profit in dollars
        double profitPerProduct = productPrice - productCost;
        System.out.println("Profit in dollars: " + profitPerProduct);

            //total potential profit
        double totaProfit = profitPerProduct * productQuantity;
        System.out.println("Total Profit: " + totaProfit);

    }
}
