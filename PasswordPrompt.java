import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";
        String input;

        do {
            System.out.print("Enter password: ");
            input = sc.next();
        } while (!input.equals(correctPassword));

        System.out.println("Access Granted");

        sc.close();
    }
}