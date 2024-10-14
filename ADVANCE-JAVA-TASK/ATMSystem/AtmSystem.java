import java.util.*;

public class ATMSystem {
    static class User {
        String name;
        String accountNumber;
        String phone;
        String pin;
        double balance;

        public User(String accountNumber, String pin, String name, String phone, double balance) {
            this.accountNumber = accountNumber;
            this.pin = pin;
            this.name = name;
            this.phone = phone;
            this.balance = balance;
        }
    }

    static class Transaction {
        int sNo;
        String date;
        String type;
        double amount;

        public Transaction(int sNo, String date, String type, double amount) {
            this.sNo = sNo;
            this.date = date;
            this.type = type;
            this.amount = amount;
        }
    }

    static Map<String, User> users = new HashMap<>();
    static Map<String, List<Transaction>> transactionHistory = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // user data
        users.put("110004455", new User("110004455", "3333", "Jatin Kumar", "9876543210", 50000));

        // ATM operation
        System.out.print("Enter Account number: ");
        String accountNumber = scanner.nextLine();

        User currentUser = users.get(accountNumber);

        if (currentUser != null) {
            if (authenticateUser(currentUser)) {
                System.out.println("Welcome, " + currentUser.name + "!");
                showMenu(currentUser);
            } else {
                System.out.println("Maximum attempts reached. Exiting...");
            }
        } else {
            System.out.println("Invalid account number.");
        }
    }

    // login 3 attempts
    private static boolean authenticateUser(User user) {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            String inputPin = scanner.nextLine();

            if (inputPin.equals(user.pin)) {
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        }
        return false;
    }

    // Show ATM option
    private static void showMenu(User user) {
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Change PIN");
            System.out.println("2. Check Balance");
            System.out.println("3. Change Phone Number");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Deposit Amount");
            System.out.println("6. View Transaction History");
            System.out.println("7. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    changePin(user);
                    break;
                case 2:
                    checkBalance(user);
                    break;
                case 3:
                    changePhoneNumber(user);
                    break;
                case 4:
                    withdrawAmount(user);
                    break;
                case 5:
                    depositAmount(user);
                    break;
                case 6:
                    viewTransactionHistory(user);
                    break;
                case 7:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Change the user's PIN
    private static void changePin(User user) {
        System.out.print("Enter new PIN: ");
        String newPin = scanner.nextLine();
        user.pin = newPin;
        System.out.println("PIN changed successfully!");
    }

    // Check the user's balance
    private static void checkBalance(User user) {
        System.out.println("Your current balance is: ₹" + user.balance);
    }

    // Change the user's phone number
    private static void changePhoneNumber(User user) {
        System.out.print("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        user.phone = newPhone;
        System.out.println("Phone number updated successfully!");
    }

    // Withdraw 
    private static void withdrawAmount(User user) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (amount > 0 && amount <= user.balance) {
            user.balance -= amount;
            addTransaction(user, "Withdrawal", amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
            checkBalance(user);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Deposit 
    private static void depositAmount(User user) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (amount > 0) {
            user.balance += amount;
            addTransaction(user, "Deposit", amount);
            System.out.println("₹" + amount + " deposited successfully.");
            checkBalance(user);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // history
    private static void viewTransactionHistory(User user) {
        List<Transaction> history = transactionHistory.get(user.accountNumber);
        if (history != null && !history.isEmpty()) {
            System.out.println("Transaction History:");
            System.out.println("S.No\tDate\t\tType\t\tAmount");
            for (Transaction t : history) {
                System.out.println(t.sNo + "\t" + t.date + "\t" + t.type + "\t\t₹" + t.amount);
            }
        } else {
            System.out.println("No transaction history available.");
        }
    }

    // Add record
    private static void addTransaction(User user, String type, double amount) {
        List<Transaction> history = transactionHistory.getOrDefault(user.accountNumber, new ArrayList<>());
        history.add(new Transaction(history.size() + 1, new Date().toString(), type, amount));
        transactionHistory.put(user.accountNumber, history);
    }
}
