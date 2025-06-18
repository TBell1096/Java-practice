public class LockerService {


    private Locker[] lockerList;



    public boolean checkPin(int lockerNumber, String pin) {
        if (lockerNumber < 1 || lockerNumber > lockerList.length) {
            return false;
        }
        if (lockerList[lockerNumber - 1] == null || !lockerList[lockerNumber - 1].isRented()) {
            return false;
        }
        return lockerList[lockerNumber - 1].open(pin);
    }

    public boolean isLockerRented(int lockerNumber) {
        if (lockerNumber < 1 || lockerNumber > lockerList.length) {
            return false;
        }
        return lockerList[lockerNumber - 1] != null && lockerList[lockerNumber - 1].isRented();
    }

    public LockerService(int maxLockers) {
        lockerList = new Locker[maxLockers];
    }

    public int getNextLockerNumber() {
        for (int i = 0; i < lockerList.length; i++) {
            if (lockerList[i] != null && !lockerList[i].isRented()) {
                return i + 1;
            } else if (lockerList[i] == null) {
                lockerList[i] = new Locker(i + 1);
                Utilities.print("here is your Locker number: " + (i + 1));
                return i + 1;
            }

        }
        return -1;

    }

    public String rentLocker(int lockerNumber) throws Exception {
        return lockerList[lockerNumber-1].rentLocker();

    }


    public void showAvailableLockers() {
        boolean currentlyRented =false;
        for (int i = 0; i < lockerList.length; i++) {
            if (lockerList[i] != null && lockerList[i].isRented()) {
                Utilities.print("Locker " + (i +1));
                currentlyRented = true;
            }
        }
    }

    public void releaseLocker(int lockerNumber) {
        lockerList[lockerNumber - 1].releaseLocker();
    }
}




