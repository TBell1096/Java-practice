public class Main {
    public static String selectDrink(String choice) {
        if (choice.toLowerCase().equals("water")) {
            return "You selected water";
        } else if (choice.toLowerCase().equals("soda")) {
            return "You selected soda";
        } else if (choice.toLowerCase().equals("juice")) {
            return "You selected juice";
        }else {
            return "Invalid selection";
        }

    }

    private static void runTest() {
        String[] inputs = {"water", "soda", "juice"};
        String[] outputs = {"You selected water", "You selected soda", "You selected juice"};

        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String output = outputs[i];
            System.out.println("Received input " + input);
            System.out.println("Testing with " + input + " ...");
            System.out.println("Drink selected: " + input);
            String actual = selectDrink(input);
            if (output.equals(actual)) {
                System.out.println("Passed!");
            } else {
                System.out.println("FAIL: Expected ' " + output + "', got '" + actual + "' ");
            }
        }
    }

    public static void main(String[] args) {
        selectDrink("water");

        runTest();
    }
}
