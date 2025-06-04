import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] addresses = {"123 Main St", "456 Main St", "789 Main St"};
        String[] size = {"small", "medium", "large"};
        int addressIndex = 0;
        int sizeIndex = 0;
        for (int i = 0; i <addresses.length; i++) {
            System.out.println((i + 1) + ". " + addresses[i]);
        }

        System.out.print("Shipping address?: ");
        String shipping = input.nextLine();
        addressIndex = Integer.parseInt(shipping);


        System.out.print("Order quantity? ");
        String quantityStr = input.nextLine();
        int quantity = Integer.parseInt(quantityStr);

        for (int i = 0; i <size.length; i++) {
            System.out.println((i + 1) + ". " + size[i]);
        };

        System.out.print("Size?: ");
        String sizeStr = input.nextLine();
        sizeIndex = Integer.parseInt(sizeStr);

        System.out.println("\nDetails:");
        System.out.println("Address: " + addresses[addressIndex - 1]);
        System.out.println("Size: " + size[sizeIndex - 1]);

    }
}
