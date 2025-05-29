public class Main {
    public static void main(String[] args) {
        String firstName = "Harry";
        String lastName = "Potter";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);

        System.out.println("Length: " + fullName.length());

        System.out.println("First Character: " + fullName.charAt(0));
        System.out.println("Index of 'r': " + fullName.indexOf('r'));


        //Extracting parts of a string
        String sentence = "Learning Java is fun!";
        System.out.println("First word: " + sentence.substring(0, 8));
        System.out.println("Second word: " + sentence.substring(9, 13));
        System.out.println("Last word: " + sentence.substring(17));

        // splitting strings
        String csvData = "apple,banana,grape,orange";
        String[] fruits = csvData.split(",");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + i + ": " + fruits[i]);
        }

        //Replacing Characters
        String s2 = "The quick brown fox.";
        String replaced = s2.replace("quick", "slow").replace(" ", "_");
        System.out.println(replaced);

        // Null and empty strings
        String empty = null;
        String space = " ";
        if (empty == null) {
            System.out.println("the String is null, cannot compute length.");
        }
        System.out.println(space.length());
    }
}
