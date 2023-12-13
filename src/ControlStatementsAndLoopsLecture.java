import java.util.Scanner;

public class ControlStatementsAndLoopsLecture {
    public static void main(String[] args) {
//        boolean isThisTrue = 4 == 5; // false
        boolean isThisTrue = 5.0 == 5; // true
        boolean thisIsNotTure = 5.0 != 5; // false

        System.out.println(isThisTrue);
        System.out.println(thisIsNotTure);

        System.out.println(19 > 55); // false
        System.out.println(19 < 55); // true
        System.out.println(55 <= 55); // true
        System.out.println(55 >= 55); // true

        System.out.println(true  && false); // false
        System.out.println(true || false); // true

        System.out.println(!true);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = scanner.next();

        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

        // If Statements
        if (confirmation) {
            System.out.println("Thanks, here's more about Java!");
        } else if (userInput.equalsIgnoreCase("n")) {
            System.out.println("That's too bad! Keep Digging!!!");
        } else {
            System.out.println("You've unlocked the Ruby Course! HA! HA! HA!");
        }

        // Switch Case
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        // While Loops
        int j = 0;
        while (j < 10) {
            System.out.println("J is " + j);
            j++;
        }

        // Do Loops
        do {
            System.out.println("You will see this despite the condition!");
        } while (false);

        // For Loop
        for (int i = 0; i < 10; i += 1) {
            System.out.println("I is " + i);
        }

        // print the numbers 1 through 5

        for(int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // --------------+
            } //                        |
        } //                            |
        // <----------------------------+

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }
    }
}
