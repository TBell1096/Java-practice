import java.util.Random;
public class Locker {
    private int lockerNumber;
    private String pin;


    public Locker (int lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public boolean open(String pin) {
        if (this.pin.equals(pin)) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isRented() {
        return this.pin != null;
    }

    public String rentLocker() throws Exception {
        if (isRented()) {
            throw new Exception("Locker is already rented.");
        }
        this.pin =  createPin();
        Utilities.print("Here is your: " + this.pin);

        return this.pin;
    }



    private String createPin() {
        Random rng = new Random();
        int num = rng.nextInt(10000);
        return String.format("%04d", num);
    }

    public void releaseLocker() {
        this.pin = null;
    }

}
