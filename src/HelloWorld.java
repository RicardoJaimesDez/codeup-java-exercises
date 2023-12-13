public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Syntax, Types, and Variables Exercise

        // #1 - Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 52;
        System.out.println("My favorite number is " + myFavoriteNumber);

        // #2 - Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "This is my second string";
        System.out.println(myString);

        // #3 - Change your code to assign a character value to myString. What do you notice?

        // myString = 'A'; Noticed that it gives an error.

        // #4 - Change your code to assign the value 3.14159 to myString. What happens?

        // myString = 3.14159; Cannot do that because myString already has a value.

        // #5 - Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

        // long myNumber;
        // System.out.println(myNumber); Doesn't ready - Null

        // #6 - Change your code to assign the value 3.14 to myNumber. What do you notice?

        // long myNumber = 3.14; Error - Long doesn't take decimal numbers.

        // #7 - Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // long myNumber = 123L;
        // System.out.println(myNumber);

        // #8 - Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        //myNumber = 123;

        // #9 - Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        float myNumber = 3.14F;
        // Add F fixes the error.


        // #10 - Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        // int x = 5; x is already declared
//        System.out.println(++x);
//        System.out.println(x);
        // What is the difference between the above code blocks? Explain why the code outputs what it does.

        // #11 - Try to create a variable named class. What happens?

        // float class = 25; Cannot declare variables names that are reserved keywords!

        // #12 - Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //

//         String theNumberThree = "three";
//         Object o = theNumberThree;
//         int three = (int) o;

        //Copy and paste the code above and then run it. Does the result match with your expectation?
        //
        //How is the above example different from the code block below?
        //
        //int three = (int) "three";
        //What are the two different types of errors we are observing?

        // #13 - Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
//        x += 5;
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        x /= y;
//        y = y - x;
//        y -= x;

        // #14 - What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        int largeInt = Integer.MAX_VALUE +10;
        System.out.println(largeInt);
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

        // [^1]: How many bytes of memory are allocated to store a variable of this data type








    }
}
