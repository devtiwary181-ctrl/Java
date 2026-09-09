
import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;

        do {
            System.out.println("\n1.Balance  2.Deposit  3.Withdraw  4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Deposit: ");
                    balance += sc.nextDouble();
                    break;
                case 3:
                    System.out.print("Withdraw: ");
                    double w = sc.nextDouble();
                    if (w <= balance) balance -= w;
                    else System.out.println("Insufficient balance");
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
