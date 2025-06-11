import java.util.Scanner;
public class Utilities {
    private static Scanner input = new Scanner(System.in);
    public static void print(String msg) {
        System.out.println(msg);


    }

    public static String menuChoice() {
        String choice;
        while(true) {
            System.out.println("===Locker Storage ===");
            System.out.println("1.Rent a locker");
            System.out.println("2.Access a locker");
            System.out.println("3.Release a locker");
            System.out.println("4.Exit");

            choice = input.nextLine();

            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                return choice;
            }else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public static String getInput() {
        String userInput = input.nextLine();
        return userInput;
    }
}
