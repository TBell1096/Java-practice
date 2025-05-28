public class Main {
    public static void main(String[] args) {
        // Sports Statistics
        String playerName = "John";
        String jerseyNumber = "10";
        String position  = "Goalkeeper";
        boolean isStarter = true;
        String teamName = "Austin FC";

        //Movie information
        String movieTitle = "Mickey 17";
        int releaseYear = 2025;
        char rating = 'R';
        boolean isSequel = false;
        String leadActor = "Robert Patterson";

        //Weather Report
        String cityName = "Austin";
        double temperature = 75.6;
        boolean isRaining = true;
        double humidity = 10.5;
        String  weatherCondition = "It is grey and cloudy with scattered showers for most of the day";

        //Flight information
        String flightNumber = "AA258";
        String departureCity = "Dallas";
        String arrivalCity = "New York";
        int gateNumber = 41;
        int terminal = 2;
        boolean isDelayed = false;

        System.out.println("Soccer Player:" + playerName + "wears jersey number" + jerseyNumber + "and plays as a " + position +
                "for " + teamName + ".");
        System.out.println("The movie: " + movieTitle + "was released in " + releaseYear + "and stars " + leadActor + ".");
        System.out.println("Weather Report: " + cityName + "has a temperature of " + temperature + "F with " + weatherCondition + ".");
        System.out.println("Flight: " + flightNumber + "departs from " + departureCity + "to " + arrivalCity + "at gate number "
        + gateNumber + "terminal " + terminal + " with no delays.");

        //Working with boolean variables
        boolean hasHomework = true;
        boolean isWeekend = false;
        boolean attendClass = true;
        System.out.println("Do I have homework?: " + hasHomework);
        System.out.println("Is it the weekend?: " + isWeekend);
        System.out.println("Did I attend class today?: " + attendClass);

        char firstInitial = 'T';
        char lastInitial = 'B';
        char favoriteGrade = 'A';
        System.out.println("My name is " + firstInitial + lastInitial + "and my favorite grade is " + favoriteGrade + ".");

    }
}
