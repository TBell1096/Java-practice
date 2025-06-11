public class Main {

    public static void main(String[] args) {
        boolean keepRunning = true;
        LockerService service = new LockerService(100);

        while (keepRunning) {
            String choice = Utilities.menuChoice();

            switch (choice) {
                case "1":
                    //Rent locker
                    int lockerNumber = service.getNextLockerNumber();
                    if (lockerNumber == -1){
                        Utilities.print("There are no more available lockers.");
                    } else {
                        try {
                            String pin = service.rentLocker(lockerNumber);

                        } catch (Exception e) {
                            Utilities.print("Locker unavailable.");
                        }
                    }
                    break;

                case "2":
                    //access locker
                    service.viewLockerList();
                    String userInput = Utilities.getInput();
                    int userLocker = Integer.parseInt(userInput);
                    try {
                        if (userLocker < 1 || userLocker > 100) {
                            Utilities.print("Please enter your locker number.");
                        } else if (!service.isLockerRented(userLocker)) {
                            Utilities.print("That locker not rented.");
                        } else {
                            while (true) {
                                Utilities.print("Please enter your pin: ");
                                String pin = Utilities.getInput();
                                if (service.checkPin(userLocker, pin)) {
                                    Utilities.print("Locker  opened!");
                                    break;
                                } else {
                                    Utilities.print("Incorrect pin.");
                                }
                            }
                        }
                    } catch (Exception e) {
                        Utilities.print("Invalid input.");
                    }
                    break;

                case "3":
                    //Release locker
                    service.releaseLockerList();
                    String releaseInputStr = Utilities.getInput();
                    int releaseInput = Integer.parseInt(releaseInputStr);
                    try {
                        if (releaseInput < 1 || releaseInput > 100) {
                            Utilities.print("Please enter your locker number.");
                        } else if (!service.isLockerRented(releaseInput)) {
                            Utilities.print("That locker not rented.");
                        } else {
                            while (true) {
                                Utilities.print("Please enter your pin: ");
                                String pin = Utilities.getInput();
                                if (service.checkPin(releaseInput, pin)) {
                                    Utilities.print("Are you sure? (y/n): ");
                                    String areyouSure = Utilities.getInput().toLowerCase();
                                    if (areyouSure.equals("n")) {
                                        Utilities.print("Locker has not been released");
                                        break;
                                    } else if (areyouSure.equals("y")) {
                                        service.releaseLocker(releaseInput);
                                        Utilities.print("Locker " + releaseInput + " has been released.");
                                        break;
                                    }
                                } else {
                                    Utilities.print("Incorrect pin.");
                                }
                            }
                        }
                    } catch (Exception e) {
                        Utilities.print("Invalid input.");
                    }
                    break;

                case "4":
                    //quit
                    keepRunning = false;
                    break;

                default:
                    Utilities.print("Invalid input. Please enter a choice.");
            }
        }
    }
}