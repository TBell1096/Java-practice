import javax.swing.text.Style;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Counting up to 100 but print only even numbers

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //count down
//        System.out.print("Enter a starting number:  ");
//        String startstr = input.nextLine();
//        int start = Integer.parseInt(startstr);
//        while (start > 0) {
//            start--;
//            System.out.println(start);
//        }
//        System.out.println("Blast off!");


        //guess the number
//        int min = 1;
//        int max = 50;
//        int guess;
//        int randomNumber = (int) (Math.random() * (max - min + 1)) +min;
//     do {
//         System.out.print("Guess a number between 1 and 50: ");
//         String guessStr = input.nextLine();
//          guess = Integer.parseInt(guessStr);
//
//     } while (guess != randomNumber);

        //multiplication table
//        System.out.print("Enter a number to multiply: ");
//        String numStr = input.nextLine();
//        int num = Integer.parseInt(numStr);
//        for (int i = 1; i <= 10; i++ ){
//            System.out.println(num + " * " + i + " = " + (num * i));
//        }

        //Password validator
//        String password = "letmein";
//        String userPassword = "";
//        while (userPassword != password) {
//            System.out.print("Please enter your password: ");
//            userPassword = input.nextLine();
//            if (userPassword.equals(password)) {
//                break;
//            }
//
//        }

        //Find first vowel
//        System.out.print("Enter a word: ");
//        String word = input.nextLine();
//        String vowel = "aeiou";
//        for (int i= 0; i < word.length(); i++) {
//            char firstChar = word.charAt(i);
//            if (vowel.indexOf(firstChar) != -1) {
//                System.out.println(i);
//                break;
//            }
//        }

        //Simple ATM system
//        int balance = 500;
//        int user;
//        int subtract;
//        int deposit;
//
//        do {
//            System.out.print("Would you like to: (1) Withdraw (2) Deposit (3) Check Balance (4) Exit: ");
//            String userStr = input.nextLine();
//            user = Integer.parseInt(userStr);
//            if (user == 1) {
//                System.out.print("How much would you like to withdraw: ");
//                String subtractStr = input.nextLine();
//                subtract = Integer.parseInt(subtractStr);
//                 balance = balance - subtract;
//
//            }
//            if (user == 2) {
//                System.out.print("How much would you like to deposit: ");
//                String depositStr = input.nextLine();
//                deposit = Integer.parseInt(depositStr);
//                int depositMoney = balance + deposit;
//            }
//            if (user == 3) {
//                System.out.println("Your balnce is: " + balance);
//            }
//
//
//        } while (user != 4);



        // Fizzbuzz
//        for (int i=1; i <= 100; i++) {
//
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            System.out.println(i);
//        }

        //Reverse String
//        System.out.print("Enter a word: ");
//        String reverse = input.nextLine();
//        for (int i=reverse.length() - 1; i >= 0; i-- ) {
//            System.out.println(reverse.charAt(i));
//        }

        //Prime number checker
//        System.out.print("Enter a number: ");
//        int prime = Integer.parseInt(input.nextLine());
//        boolean findFactor = false;
//        if (prime < 1 ) {
//            System.out.printf("%d is not prime.%n", prime);
//        } else if (prime == 1) {
//            System.out.printf("%d is prime.%n", prime);
//        } else {
//            for (int i =2; i < prime; i++) {
//                if (prime % i == 0){
//                    System.out.printf("%d is not prime.%n", prime);
//                    findFactor = true;
//                    break;
//                }
//            }
//            if (!findFactor) {
//                System.out.printf("%d is prime.%n", prime);
//            }
//        }
            //Word Counter
//        System.out.print("Enter a sentence: ");
//        String sentence = input.nextLine();
//        String withSpace = sentence + " ";
//        int wordCount = 0;
//        for (int i = 0; i < withSpace.length(); i++) {
//            if (withSpace.charAt(i) == ' '){
//                wordCount++;
//            }
//        }
//        System.out.println("There are: " + wordCount + " words in your sentence.");

        //Skip negative numbers
//        int numInput = 1;
//        while (true) {
//            System.out.print("Enter a number: ");
//            String numStr = input.nextLine();
//            numInput = Integer.parseInt(numStr);
//            if(numInput < 0) {
//                continue;
//            }
//            if(numInput == 0) {
//                break;
//            }
//        }

        //Find first prime
//        int min;
//        int max;
//        System.out.print("Enter two numbers from 1 to 100:  ");
//        String minStr = input.nextLine();
//        min = Integer.parseInt(minStr);
//        String maxStr = input.nextLine();
//        max = Integer.parseInt(maxStr);
//        for(int i = min; i <= max; i++) {
//            if(i == 1 || i % 1 == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

//        //fixing infinite loop
//        int i = 0;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }


        //Find even number
//        while (true) {
//            System.out.print("Enter a even number: ");
//            String evenNumStr = input.nextLine();
//            int evenNum = Integer.parseInt(evenNumStr);
//            if (evenNum % 2 == 0) {
//                break;
//            } else {
//                System.out.println("That is not a even number, please enter a even number.");
//            }
//        }


        //Guess the word
        List<String> words =new ArrayList<>(3);
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        while (true){
            int randomIndex = (int) (Math.random() * words.size());
            String secretWord = words.get(randomIndex);
            System.out.print("Guess the secret word: ");
            String guess = input.nextLine();
            if (guess.equals(secretWord)) {
                System.out.println("Congrats! You win!");
                break;
            }
            else {
                System.out.println("Try again!");
                if(secretWord.contains(guess)) {
                    System.out.println("You're getting there! the word is a fruit.");
                }
            }
        }
    }
}
