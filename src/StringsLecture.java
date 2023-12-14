import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        System.out.println("con" + "cat");

        String con = "con";
        System.out.println(con.concat("cat"));
        System.out.println(con);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name?");
        String name = scanner.next();
        if (name.startsWith("R")) {
            System.out.println("OMG MY NAME STARTS WITH AN R TOO!");
        }
        if (name.endsWith("y")) {
            System.out.println("OMG! My name ends with a y too!!");
        }
        if (name.endsWith("y") && name.startsWith("R") && !name.equals("Ricky")) {
            System.out.println("WOW! HOW DOES THAT WORK?!?!?!");
        }

        String sample = "\nI like turtles.   Donkey Rattle.     ";
        System.out.println(sample.charAt(8));
        System.out.println(sample.substring(1, 17));
        System.out.println(sample.indexOf("turtles"));
        System.out.println(sample.indexOf("."));
        System.out.println(sample.lastIndexOf("."));
        System.out.println(sample.length());
        System.out.println(sample.replace("turtles", "chocolate"));
        System.out.println(sample.toLowerCase());
        System.out.println(sample.toUpperCase());
        System.out.println(sample.trim()); // trim works at the end and end but not the middle!
    }
}
