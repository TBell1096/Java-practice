import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {

    private static void displayChoices(String[] choices) {
        for (int i = 0; i <choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    private static String promptUserForString(String prompt) {
        java.util.Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        return console.nextLine();
    }
    private static String promptUserForValidatedString(String prompt, String[] validResponses) {
        boolean valid = false;
        String result = "";
        while (!valid) {
            result = promptUserForString(prompt);
            for (int i =0; i < validResponses.length; i++) {
                if(result.equals(validResponses[i])) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Please input a valid response");
            }
        }
        return result;
    }

    private static int promptUserForInt(String prompt) {
        java.util.Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        return Integer.parseInt(console.nextLine());
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart app!");
        Scanner input = new Scanner(System.in);

        String[] addresses = {"123 Main St", "456 Main St", "789 Main St"};
        String[] sizes = {"small", "medium", "large"};
        String[] validTaxExemptResponse = {"y", "n"};
        String[] validShippingMethods = {"standard", "overnight", "twoday"};
        int addressIndex = 0;
        int sizeIndex = 0;
        boolean confirm = false;
        String taxExempt =" ";
        String shipping = "";
        String promoCode = "";
        int orderQuantity = 0;

        while (!confirm) {

            String address = null;
            String size = null;

            taxExempt = promptUserForValidatedString("Are you tax-exempt? (y/n) ", validTaxExemptResponse);

            while (address == null) {
                try {
                    displayChoices(addresses);
                    addressIndex = promptUserForInt("Shipping address?: ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please enter a valid menu option.");
                }


                shipping = promptUserForValidatedString("Shipping? (standard/ overnight/ two-day)", validShippingMethods);
                orderQuantity = promptUserForInt("Order quantity? ");


            }

            while (size == null) {
                try {
                    displayChoices(sizes);
                    sizeIndex = promptUserForInt("Size?: ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please enter a valid menu option.");
                }
            }
            promoCode = promptUserForString("Promo code for free shipping?");


            System.out.println("\nDetails:");
            System.out.println("Address: " + addresses[addressIndex - 1]);
            System.out.println("Shipping: " + shipping);
            System.out.println("Order Quantity: " + orderQuantity);
            System.out.println("Size: " + sizes[sizeIndex - 1]);
            System.out.println("Promo code: " + promoCode);
            System.out.println("Confirm Order y/n");
            confirm = "y".equals(input.nextLine());

        }
        System.out.println("Bye!");
    }
}
