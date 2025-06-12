import java.util.Scanner;
public class Locker {
    private String lockerId;
    private boolean isOccupied;
    private String contents;

    Scanner io = new Scanner(System.in);
    Utils utils = new Utils();
    public String getLockerId() {
        return lockerId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getContents() {
        return contents;
    }

    public Locker(String lockerId) {
        this.lockerId = lockerId;
        isOccupied =false;
        contents = "";

    }

    public void storeItem(String item) {
        utils.displayText("Enter item to store: ");
        item = utils.getUserInput();
        contents = item;
        isOccupied = true;
        System.out.println("item stored in " + lockerId);
    }

    public String  removeItem() {
        contents ="";
        System.out.println("Locker is now empty.");
        isOccupied = false;
        return removeItem();
    }

    public String toString() {
        return utils.lockerDisplay("Locker: " + lockerId + "Rent: " + isOccupied + "contents " + contents);

    }
}
