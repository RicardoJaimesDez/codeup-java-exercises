import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // #1 - Loop Basics
        // a. While loop
        // Create an integer variable i with a value of 5.

//        int i  = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // b. Do While
//        int j = 0;
//
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);

//        long j = 2;
//        do {
//            System.out.println(j);
//            j *= j;
//        } while (j < 1_000_000);

        // c. - Refactor the previous two exercises to use a for loop instead.
        // Create an integer variable i with a value of 5.
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

        // Create a For loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        for (int j = 0; j <= 100; j += 2) {
//            System.out.println(j);
//        }

        // Alter your loop to count backwards by 5's from 100 to -10.
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//        }

        // Create a for loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        for (long j = 2; j < 1_000_000; j *= j) {
//            System.out.println(j);
//        }

        // 2. Fizzbuzz
        /*
        * One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        For multiples of three: print “Fizz” instead of the number.
        For the multiples of five: print “Buzz”.
        For numbers which are multiples of both three and five: print “FizzBuzz”.
        * */
        // Write a program that prints the numbers from 1 to 100.
        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // 3. Display a table of powers.
        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        // Ask if the user wants to continue.
        // Assume that the user will enter valid data.
        // Only continue if the user agrees to.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some integer value: ");
        int userInput = Integer.parseInt(scanner.next());

        System.out.printf("%n%-7s | %-7s | %-7s%n", "number", "squared", "cubed");
        System.out.println("--------------------------");
        for (int i = 1; i <= userInput; i++) {
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%-7d | %-7d | %-7d%n", i, squared, cubed);
        }

        System.out.print("Would you like to continue? [y/n] ");
        String userInput2 = scanner.next();
        boolean confirmation = userInput2.equalsIgnoreCase("y");

        if (confirmation) {
            System.out.print("Please enter some integer value: ");
            int userInput3 = Integer.parseInt(scanner.next());

            System.out.printf("%n%-7s | %-7s | %-7s%n", "number", "squared", "cubed");
            System.out.println("--------------------------");
            for (int i = 1; i <= userInput3; i++) {
                int squared = i * i;
                int cubed = i * i * i;
                System.out.printf("%-7d | %-7d | %-7d%n", i, squared, cubed);
            }
        }

        // #4 - Convert given number grades into letter grades.
        // Prompt the user for a numerical grade from 0 to 100.
        // Display the corresponding letter grade.
        // Prompt the user to continue.
        // Assume that the user will enter valid integers for the grades.
        // The application should only continue if the user agrees to.

        System.out.print("%nEnter a grade between 0 to 100: ");
        int gradeInput = Integer.parseInt(scanner.next());

        if (gradeInput >= 88 && gradeInput <= 100) {
            System.out.println("Grade: A");
        } else if (gradeInput <= 87 && gradeInput >= 80) {
            System.out.println("Grade: B");
        } else if (gradeInput < 79 && gradeInput >= 67) {
            System.out.println("Grade: C");
        } else if (gradeInput < 66 && gradeInput >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        System.out.print("Would you like to continue? [y/n] ");
        String userInput3 = scanner.next();
        boolean confirmation2 = userInput3.equalsIgnoreCase("y");

        if (confirmation2) {
            System.out.print("%nEnter a new grade between 0 to 100: ");
            int gradeInput2 = Integer.parseInt(scanner.next());

            if (gradeInput2 >= 88 && gradeInput2 <= 100) {
                System.out.println("Grade: A");
            } else if (gradeInput2 <= 87 && gradeInput2 >= 80) {
                System.out.println("Grade: B");
            } else if (gradeInput2 < 79 && gradeInput2 >= 67) {
                System.out.println("Grade: C");
            } else if (gradeInput2 < 66 && gradeInput2 >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}
