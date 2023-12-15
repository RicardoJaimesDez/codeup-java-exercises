import java.util.Scanner;

public class MethodsLecuture {
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(int numberOfRepetitions) {
        for (int i = numberOfRepetitions; i > 0; i--) {
            System.out.println("Hellow, World!");
        }
    }

    public static String sayHello(String Greetings, String name) {
        return String.format("%s, %s!", Greetings, name);
    }
    public static String sayHello() {
        return "Hello, World!";
    }

    public static int returnThree() {
        return 3;
    }

    public static void  printHello(String name) {
        System.out.printf("Howdy, %s!\n", name);
    }

    // Recursion Example 1
    public static void areWeThereYet(Scanner scanner) {
        System.out.print("Are we there yet?");
        String resp = scanner.nextLine();
        if (resp.equalsIgnoreCase("yes")) {
            System.out.println("Whoopeee!!!");
        } else {
            areWeThereYet(scanner);
        }
    }

    public static void countdown(int start) {
        if (start == 0) {
            System.out.println("Happy New Year!!!");
            return;
        }
        System.out.println(start + "!");
        countdown(start - 1);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Ricky"));
        System.out.println(sayHello("Yes, I can hear you", "Clem Fandango"));
        System.out.println(sayHello());
        sayHello(30);
        int three = returnThree();
        System.out.println(three);
        printHello("Ricky");
        Scanner sc = new Scanner(System.in);
        areWeThereYet(sc);
        countdown(10);
    }
}
