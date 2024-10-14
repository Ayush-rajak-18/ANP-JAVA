import java.util.Scanner;

public class BankingSystem {
    private static String savedLogin = "ayush";
    private static String savedPassword = "ayush04";
    private static double accountBalance = 20000.00; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login 
        System.out.print("Enter your login: ");
        String login = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Validate login 
        if (login.equals(savedLogin) && password.equals(savedPassword)) {
            System.out.println("Login successful!");

            // options
            while (true) {
                System.out.println("\nPlease choose an option:");
                System.out.println("1. Change Password");
                System.out.println("2. Check Balance");
                System.out.println("3. Deposit Amount");
                System.out.println("4. Withdraw Amount");
                System.out.println("5. Exit");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        changePassword(scanner);
                        break;
                    case 2:
                        checkBalance();
                        break;
                    case 3:
                        depositAmount(scanner);
                        break;
                    case 4:
                        withdrawAmount(scanner);
                        break;
                    case 5:
                        System.out.println("Thank you for using our banking system. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            }
        } else {
            System.out.println("Invalid login or password. Please try again.");
        }
    }

    // change the password
    private static void changePassword(Scanner scanner) {
        System.out.print("Enter your current password: ");
        String currentPassword = scanner.nextLine();

        if (currentPassword.equals(savedPassword)) {
            System.out.print("Enter your new password: ");
            String newPassword = scanner.nextLine();

            savedPassword = newPassword;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Incorrect current password. Password change failed.");
        }
    }

    // check the balance
    private static void checkBalance() {
        System.out.println("Your current balance is: ₹" + accountBalance);
    }

    // deposit amount
    private static void depositAmount(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ₹");
        double depositAmount = scanner.nextDouble();

        if (depositAmount > 0) {
            accountBalance += depositAmount;
            System.out.println("₹" + depositAmount + " has been deposited successfully.");
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //  withdraw amount
    private static void withdrawAmount(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ₹");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > 0 && withdrawAmount <= accountBalance) {
            accountBalance -= withdrawAmount;
            System.out.println("₹" + withdrawAmount + " has been withdrawn successfully.");
            checkBalance();
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }
}
