import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        // #1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Explore the Scanner Class
        // #1 - Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        //What happens if you input something that is not an integer? - Gives an Exception (which is a runtime error)

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");

        System.out.print("Enter an integer number: ");
        int userInt = scanner.nextInt();
        System.out.printf("The number you entered was: %d%n%n", userInt);

        // #2 - Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.print("Enter 3 words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.printf("The three words you entered are: %s, %s, and %s%n%n", userInput1, userInput2, userInput3);
        scanner.nextLine();
        // #3 - Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
        String userSentence = scanner.nextLine();
        System.out.printf("The sentenced you entered was: %s%n%n", userSentence);


        // Calculate the perimeter and area of my classroom

        System.out.print("Enter the length (in feet) of your classroom: ");
        String length = scanner.nextLine();
        int lengthVal = Integer.parseInt(length);

        System.out.print("Enter the width (in feet) of your classroom: ");
        String width = scanner.nextLine();
        int widthVal = Integer.parseInt(width);

        System.out.printf("With the length of %d ft. %n", lengthVal);
        System.out.printf("And with the length of %d ft. %n", widthVal);

        // Calc Area & Perimeter
        int area = lengthVal * widthVal;
        int perimeter = (2 * lengthVal) + (2 * widthVal);

        System.out.printf("The area of your classroom is %d sq/ft.%n", area);
        System.out.printf("The perimeter of your classroom is %d ft.%n", perimeter);






    }
}
