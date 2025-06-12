import java.util.Scanner;
public class Utils {
    Scanner io = new Scanner(System.in);

    public String getUserInput() {
        return io.nextLine();
    }

    public void displayText(String prompt) {
        System.out.print(prompt);
    }

    public String lockerDisplay(String prompt) {
          System.out.println(prompt);
          return prompt;
    }
}
