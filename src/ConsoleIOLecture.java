import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
//        System.out.println("I'm a message!");
//        System.out.println("I'm on the next line!");

        System.out.print("I'm a message!");
        System.out.print("I'm not on the next line!");
        System.out.println("Do I show up on the same line?!");

        String student = "Ricky";
        int favoriteNum = 19;
        float pi = 3.14F;
        System.out.printf("Hello, my name is %s, and my favorite numbers are %d and %.2f. Let's be friends! %n", student, favoriteNum, pi);
        System.out.println("Do I show up on the same line?!");

        System.out.println("Hello, my name is " + student + ", and my favorite number are " + favoriteNum + " and " + pi + ". Let's be friends!");

        // Scanner allows users to input something
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n"); // More proper way to solve the change in delimiter skips my nextLine issue.

        // Able to enter strings
        System.out.print("Enter something: ");
        // String userInput = scanner.next(); // doesn't take whitespace
        String userInput = scanner.nextLine(); // captures everything before you press enter

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        // Able to enter Integers
        System.out.print("Enter a number: ");
        int userInt = scanner.nextInt(); // captures integers

        System.out.println("You entered: --> \"" + userInt + "\" <--");

        // Able to enter Doubles
        System.out.print("Enter some float number: ");
        double userDbl = scanner.nextDouble(); // captures everything before you press enter

        System.out.println("You entered: --> \"" + userDbl + "\" <--");

        // Able to enter strings
        System.out.print("Enter something: ");
        scanner.nextLine();
        String userInput2 = scanner.nextLine(); // captures everything before you press enter
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

    }
}
