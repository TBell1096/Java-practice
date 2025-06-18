package org.example;
import java.util.Scanner;

public class TerminalUtilities {
    private  Scanner scanner =new Scanner(System.in);


    public  String getArtifactName() {
        System.out.print("Enter the artifact name: ");
        return scanner.nextLine();
    }

    public int getDiscoveryYear() {
        System.out.print("Enter the year is was discovered: ");
        return scanner.nextInt();
    }

    public String getDiscovererFirstName() {
        System.out.print("first name: ");
        return scanner.nextLine();
    }

    public String getDiscovererLastName() {
        System.out.print("Last name: ");
        return scanner.nextLine();
    }

    public String  getSpecialty() {
        System.out.println("Enter their primary specialty of discovery: ");
        return scanner.nextLine();
    }

    public String  getCuratorFirstName() {
        System.out.print("Curator first name: ");
        return scanner.nextLine();
    }

    public String getCuratorLastName() {
        System.out.print("Curator last name: ");
        return scanner.nextLine();
    }
    public String getString() {
        String answer = scanner.nextLine();
        return answer;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
