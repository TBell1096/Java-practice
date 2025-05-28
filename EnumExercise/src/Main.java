import javax.swing.undo.CannotUndoException;

public class Main {
    enum CoffeeSize {
        SMALL,
        MEDIUM,
        LARGE
    }
    enum SeatSection {
        GENERAL,
        PREMIUM,
        VIP
    }
    enum  TrafficLight {
        GREEN,
        YELLOW,
        RED
    }
    enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    enum AlertLevel {
        LOW,
        MODERATE,
        HIGH,
        SEVERE
    }
    public static void main(String[] args) {
       CoffeeSize order = CoffeeSize.MEDIUM;
       System.out.println("Selected coffee size: " + CoffeeSize.MEDIUM);

       // Convert Enum to int values
        System.out.println("GENERAL is assigned value: " + SeatSection.GENERAL.ordinal());
        System.out.println("PREMIUM is assigned: " + SeatSection.PREMIUM.ordinal());
        System.out.println("VIP is assigned: " + SeatSection.VIP.ordinal());

        // Convert int to enum
        TrafficLight[] status = TrafficLight.values();
        TrafficLight slow = status[1];
        System.out.println(slow);

        //Weekday Schedule
        System.out.println("Workday selected: " + Weekday.WEDNESDAY);
        boolean workDay = false;
        if (Weekday.WEDNESDAY != Weekday.SATURDAY) {
            System.out.println("Is it a weekend?:" + workDay);
            System.out.println("It is a workday");
        }
        //Emergency Alert system
        AlertLevel currentAlert = AlertLevel.HIGH;
        System.out.println("The current alert is: " + AlertLevel.HIGH);
        switch (currentAlert) {
            case LOW:
                System.out.println("No immediate danger. ");
                break;
            case MODERATE:
                System.out.println("Stay alert and aware. ");
                break;
            case HIGH:
                System.out.println("Take precautions and stay inform. ");
                break;
            case SEVERE:
                System.out.println("Immediate action required! ");
                break;
        }


    }

}
