import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class LockerManager {

private Locker[] lockerlist;

    Utils utils = new Utils();
    public Locker[] getLockerlist() {
        return lockerlist;
    }

    public void setLockerlist(Locker[] lockerlist) {
        this.lockerlist = lockerlist;
    }

    public void addLocker(String lockerId) {
        if (lockerlist == null) {
            lockerlist = new Locker[1];
            lockerlist[0] = new Locker(lockerId);
        }else {
            Locker[] newLockerArray = new Locker[lockerlist.length + 1];

            for (int i =0; i < lockerlist.length; i++) {
                newLockerArray[i] = lockerlist[i];
            }
            newLockerArray[lockerlist.length] = new Locker(lockerId);
            lockerlist = newLockerArray;
        }
    }

    public String getLocker(String lockerId) {
      Locker myLocker = new Locker(lockerId);
      String id = myLocker.getLockerId();
      return id;
    }

    public void removeLocker(String lockerId) {
        for(int i=0; i < lockerlist.length; i++){
            if (lockerlist[i] != null && lockerlist[i].getLockerId().equals(lockerId)) {
                Locker myLocker = lockerlist[i];
                if (myLocker.isOccupied()) {
                    String remove = myLocker.removeItem();
                    System.out.println("Removed: " + remove);
                    break;
                } else {
                    System.out.println("This locker is empty");
                }
            }
            return;
        }
System.out.println("Locker not found.");
    }


    public void displayAllLockers(){
        for (int i =0; i < lockerlist.length; i++) {
            Locker occupiedLockers = lockerlist[i];
            if(lockerlist[i] != null) {
                occupiedLockers.toString();
            }else {
                System.out.println("There are currently no lockers rented.");
            }
        }
    }

    public void addItem(String lockerId) {
        for (int i = 0; i <lockerlist.length; i++) {
            Locker myLocker = lockerlist[i];
            if (lockerlist[i] != null && lockerlist[i].getLockerId().equals(lockerId)) {
                myLocker.storeItem(lockerId);
            } else {
                utils.displayText("Locker not found.");
            }
        }
    }
}
