import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        while (true) {

            System.out.println("ATM MENU1");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Current Balance = ₹" + balance);

            } else if (choice == 2) {

                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();

                balance = balance + amount;

                System.out.println("Money Deposited Successfully");
                System.out.println("Available balance:" + balance);

            } else if (choice == 3) {

                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Money Withdrawn Successfully");
                    System.out.println("Available balance:" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }

            } else if (choice == 4) {

                System.out.println("Thank You!");
                break;

            } else {

                System.out.println("Invalid Choice");

            }
        }
    }
}
