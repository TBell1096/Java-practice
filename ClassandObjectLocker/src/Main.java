import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        LockerManager manager = new LockerManager();
        Utils utils = new Utils();
        boolean keepRunning = true;
        while(keepRunning) {
            utils.displayText("Welcome to the Storage Locker Manager!");
            utils.displayText("\n1. Add Locker\n2. Remove Locker\n3. Store Item\n4. Retrieve Item\n5. Display All Lockers\n6. Exit\n");
                utils.displayText("Choose a option: ");
                String choice = utils.getUserInput();

                switch (choice) {
                    case "1":
                        utils.displayText("Enter locker ID: ");
                        String enterLockerId = utils.getUserInput();
                        manager.addLocker(enterLockerId);
                        utils.displayText("Locker: " + enterLockerId +  " added\n");
                        break;

                    case "2":
                        utils.displayText("Enter locker ID: ");
                        String removeLockerId = utils.getUserInput();
                        manager.removeLocker(removeLockerId);
                        break;

                    case "3":
                        utils.displayText("Enter locker ID: ");
                        String addItem = utils.getUserInput();
                        manager.addItem(addItem);
                        break;
                    case "4":
                        utils.displayText("Enter locker ID: ");
                        String retrieveItem = utils.getUserInput();
                        manager.removeLocker(retrieveItem);
                        break;

                    case "5":
                        manager.displayAllLockers();
                        break;

                    case "6":
                        System.out.println("Goodbye!");
                        keepRunning = false;
                    default:
                        utils.displayText("Please enter a valid input.\n");
                }
        }
    }
}
