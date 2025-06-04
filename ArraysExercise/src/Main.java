import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare and assign array
        String[] city = {"austin", "chicago", "new york", "dallas", "houston"};
//        for(int i=0; i < city.length; i++) {
//            System.out.println(city[i]);
//        }
//
//        //Access and modify
//        city[2] = "san antonio";
//        for (int i =0; i < city.length; i++) {
//            System.out.println(city[i]);
//        }
//
//        //Total length of arrays
//        System.out.println(city.length);

        //Reverse array
        for(int i = city.length - 1; i >= 0; i--) {
            System.out.println(city[i]);
        }

        //Find specific element

//        for(int i=0; i< city.length; i++) {
//            System.out.print("Enter a city name: ");
//            String check = input.nextLine();
//
//            if(check.equals(city[i])) {
//                System.out.println("City Found!");
//                break;
//            }
//            else {
//                System.out.println("City not found!");
//
//            }
//        }
        //Sum of numbers array
//        double[] grades = {81.8, 79.2, 66.5, 94.1, 77.5};
//        double sum = 0.0;
//        for (int i= 0; i< grades.length; i++) {
//            sum += grades[i];
//        }
//        System.out.println(sum);
//
//        //Find max & min
//        double min = grades[0];
//        double max = grades[0];
//        for (int i=1; i < grades.length; i++) {
//            if (grades[i] <min) {
//                min = grades[i];
//            }
//            if (grades[i] > max) {
//                max = grades[i];
//            }
//            System.out.println("Highest grade: " + max);
//            System.out.println(("Lowest grade: " + min));
//        }
//
//        //Average grade
//        for (int i= 0; i< grades.length; i++) {
//            sum += grades[i];
//        }
//        System.out.println("Grades average = " + (sum / grades.length));

        //Occurrence
//        int[] numbers = new int[10];
//        Random randomnum = new Random();
//        int count = 0;
//        for(int i = 1; i< numbers.length; i++) {
//            numbers[i] = randomnum.nextInt(5);
//            if (numbers[i] == 3) {
//                count++;
//            }
//        }
//        System.out.println(count);


        //Shift elements
//        int[] num = {1, 2, 3, 4, 5};
//        int first = num[0];
//        for (int i=0; i< num.length -1; i++) {
//            num[i] = num[i +1];
//        }
//        num[num.length - 1] = first;
//        for (int i = 0; i<num.length; i++) {
//            System.out.println(num[i]);
//        }

        //Check for duplicates
        String[] students = {"jerry", "tom", "bill", "harold", "parker", "lin"};
        boolean duplicate = false;
        for(int i = 0; i< students.length - 1; i++) {
           for (int j = i + 1; j< students.length; j++) {
               if (students[i].equals(students[j])) {
                   System.out.println("Duplicate found!");
                   duplicate = true;
                   break;
               }
           }
        }
        if (!duplicate) {
            System.out.println("Duplicate not found.");
        }
    }
}
