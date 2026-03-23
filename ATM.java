import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;

        while (true) {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount");
                    } else {
                        balance += deposit;
                        System.out.println("Deposit successful");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful");
                    }
                    break;

                case 4:
                    System.out.println("Thank you. Exiting...");
                    sc.close();
                    return; // clean exit

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}