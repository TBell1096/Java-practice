import java.util.Scanner;
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

    private static int promptUserForInt(String prompt) {
        java.util.Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        return Integer.parseInt(console.nextLine());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] addresses = {"123 Main St", "456 Main St", "789 Main St"};
        String[] size = {"small", "medium", "large"};
        int addressIndex = 0;
        int sizeIndex = 0;

        displayChoices(addresses);
        addressIndex = promptUserForInt("Shipping address?: ");

        int orderQuantity = promptUserForInt("Order quantity? ");


        displayChoices(size);
        sizeIndex = promptUserForInt("Size?: ");

        String taxExempt = promptUserForString("Are you tax-exempt? (y/n) ");

        String shipping = promptUserForString("Shipping? (standard/ overnight/ two-day)");

        String promoCode = promptUserForString("Promo code for free shipping?");

        System.out.println("\nDetails:");
        System.out.println("Address: " + addresses[addressIndex - 1]);
        System.out.println("Size: " + size[sizeIndex - 1]);

    }
}
