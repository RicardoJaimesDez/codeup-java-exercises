import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bob: ");
        String response = scanner.nextLine();

        if (response.endsWith("?")) {
            System.out.println("Sure");
        } else if (response.endsWith("!")) {
            System.out.println("Whoa, chill the hell out!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
