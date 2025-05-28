public class Main {
    public static void main(String[] args) {
       // Loan calculator
        double loanAmount = 25000.00; // in dollars
        double annualInterestRate = 5.5; // as a percentage
        int loanTermYears = 5;
        double monthlyPayments;

        loanAmount += 5000.00;
        System.out.println(loanAmount);
        annualInterestRate -= 1;
        System.out.println(annualInterestRate);
        loanTermYears++;
        System.out.println(loanTermYears);

        if (loanAmount >= 30000) {
            System.out.println(loanAmount);

        }
         double interestPayments = (loanAmount * (annualInterestRate / 100) / 12);
        if (interestPayments >= 500) {

            System.out.println(interestPayments);
        }

        if (interestPayments < 500 && loanTermYears > 3) {
            System.out.println("This loan is affordable");
        }
        if (interestPayments > 700 || annualInterestRate > 6) {
            System.out.println("This loan is expensive");
        }
        //Temperature conversation & forecast analysis
        System.out.println("==== Temperature & Forecast ===");
        double temperatureCelsius = 25.0; // Current temperature in celsius
        boolean isRaining = false;       // indicate if it's raining
        int windSpeedKmh = 10;          // Wind in km/h

        double temperatureFahrenheit = (temperatureCelsius * (9 / 5) + 32);

        System.out.println("temperature:");
        temperatureFahrenheit += 5;
        System.out.println(temperatureFahrenheit);
        System.out.println("Wind Speeds:");
        windSpeedKmh += 5;
        System.out.println(windSpeedKmh);

        if (temperatureFahrenheit < 85) {
            System.out.println("The temp is below 85 degrees");
        }
        if (windSpeedKmh > 20) {
            System.out.println("Wind speeds have exceeded 20 kmh");
        }


        if (isRaining == false) {
            if(temperatureFahrenheit > 60 && temperatureFahrenheit < 85) {
                System.out.println("It's good day to go outside!");
            }
        }

        if (windSpeedKmh > 30) {
            if (temperatureFahrenheit < 0) {
                System.out.println("This is a weather Warning!");
            }
        }

        // Gaming Player score & Level up System

        int currentXP = 1200; //experience points
        int level = 5;
        int xpToTheNextLevel = 1500;
        boolean levelUp;


        int finishedQuest = currentXP += 300;
        System.out.println("Quest completed! You gained 300 XP!");
        System.out.println("Current XP:");
        System.out.println(finishedQuest);

        int levelingUp = xpToTheNextLevel -= finishedQuest;
        if (level < 10) {
            System.out.println("Here is your current level:");
            System.out.println(level);
        }
        if (currentXP >= 1500 && level < 10) {
            level++;
        }
        if (level > 7 || currentXP > 5000) {
            System.out.println("Congratulations! You are a pro!");
        }
    }
}