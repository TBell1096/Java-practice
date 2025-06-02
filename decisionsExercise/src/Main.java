import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean game = false;
        String message = " ";
        while (!game) {

            System.out.println("Welcome to the game!");

            System.out.println("You find yourself at the entrance of a cave.");
            System.out.print("Do you want to enter the cave (y/n)");
            String cave = console.nextLine();

            if (cave.equals("n")) {
                System.out.println("You made it home safely and had a meal with your family...");
                break;
            } else if (cave.equals("y")) {
                System.out.print("You entered the cave and you see two paths, left or right, which do you choose? (l/r)");
                String leftOrRight = console.nextLine();

                if (leftOrRight.equals("r")) {
                    System.out.println("Congratulations! You found the treasure room!");
                    System.out.print("What would you like to take home?\n(1)A gem\n(2) a Key\n(3) A book\n");
                    String treasureStr = console.nextLine();
                    int treasure = Integer.parseInt(treasureStr);
                    switch (treasure) {
                        case 1:
                            System.out.println("Congrats! You took the gem.");
                            message = "You took the gem home, sold it, and became rich! Thanks for playing!";
                            break;

                        case 2:
                            System.out.println("Congrats! You took the key.");
                            message = "The key unlocked a door further in the cave. You entered the door and found yourself in Narnia. Thanks for playing!";
                            break;

                        case 3:
                            System.out.println("Congrats! You took the book.");
                            message = "The books turned put to be a ancient spell book. Congrats! you're a wizard! Thanks for playing!";
                            break;
                    }
                    System.out.println(message);
                    break;

                } else if (leftOrRight.equals("l")) {
                    System.out.print("You walk down the path, but you see a mysterious shadowy figure. Do you fight or run (f/r)");
                    String fightOrFlee = console.nextLine();
                    if (fightOrFlee.equals("f")) {
                        System.out.println("You fought bravely but died:( Thanks for playing!");
                        break;
                    } else if (fightOrFlee.equals("r")) {
                        System.out.println("You barely managed to escape!");
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter 'f' or 'r'");
                    }
                } else {
                    System.out.println("Invalid input. Please enter 'l' or 'r'");
                }
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'");
            }
        }
    }
}