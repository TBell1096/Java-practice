import java.util.Scanner;
public class Main {

    public static void printWelcomeMessage() {
        System.out.println("Welcome to the java Methods Exercise!");
    }

    public static int sum(int val1, int val2) {
       int add = val1 + val2;
       return add;

    }

    public static int convertToFahrenheit(double celsius) {
         return (int) ((celsius * 9.0 / 5.0) + 32);
    }

    public static boolean isEven(int number) {
       boolean even =false;
        if (number % 2 == 0) {
            System.out.println("This is a even number!");
             even = true;
        } else {
            System.out.println("This is odd!");
        }
        return even;
    }

    public static void printMultipleTimes(String text, int time) {
        for (int i = 0; i < time; i++ ) {
            System.out.println(text);
        }
    }

    public static int findMax(int a, int b, int c) {
        int highest = a;
        if (b > highest) {
            highest = b;
        }
        if (c > highest) {
            highest = c;
        }
        return highest;

    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }return n * factorial(n - 1);
    }

    public static String greet(String name) {
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static String greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        return name;
    }

    public static String countVowels(String text) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i< text.length(); i++) {
            char vowelChar = text.charAt(i);
            if (vowels.indexOf(vowelChar) != -1) {
                count++;
            }
        }
        System.out.println("There are " + count + " vowels.");
        return text;
    }

    public static int calculator(int num1, int num2, char operator) {
        int total = 0;
        switch (operator) {
            case '+':
                total = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + total);
                break;
            case '-':
                total = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + total);
                break;
            case '*':
                total = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + total);
                break;
            case '/':
                total = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + total);
                break;
            default:
                System.out.println("invalid input.");
                break;

        }
        return total;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //print welcome
        printWelcomeMessage();

        //sum of two numbers
        int add = sum(2,2);
        System.out.println(add);

        //convert celsius to fahrenheit
        convertToFahrenheit(26.2);


        //Check if even or odd
        isEven(43);

        //Printing a string multiple times
        printMultipleTimes("Hello", 5);

        //Find max of three numbers
        findMax(10, 25, 5);

        //recursion
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(10));

        //Method overloading
        greet("james");

        greet("kerry", 23);

        //Count the vowels
        countVowels("hello world");
        countVowels("java programming");

        //Calculator
        calculator(5, 5, '+');
        calculator(6, 5, '*');
        calculator(10, 2, '/');
        calculator(25, 5, '-');

    }
}
