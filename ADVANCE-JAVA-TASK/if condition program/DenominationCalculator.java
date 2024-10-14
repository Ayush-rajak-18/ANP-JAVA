import java.util.Scanner;

public class DenominationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int notes2000 = 0, notes500 = 0, notes200 = 0, notes100 = 0, notes50 = 0;

        if (amount >= 2000) {
            notes2000 = amount / 2000;
            amount = amount % 2000; // Remaining amount
        }

        if (amount >= 500) {
            notes500 = amount / 500;
            amount = amount % 500;
        }

        if (amount >= 200) {
            notes200 = amount / 200;
            amount = amount % 200;
        }

        if (amount >= 100) {
            notes100 = amount / 100;
            amount = amount % 100;
        }

        if (amount >= 50) {
            notes50 = amount / 50;
            amount = amount % 50;
        }

        
        System.out.println("Denomination breakdown:");
        if (notes2000 > 0) {
            System.out.println("2000 X " + notes2000 + " = " + (notes2000 * 2000));
        }
        if (notes500 > 0) {
            System.out.println("500 X " + notes500 + " = " + (notes500 * 500));
        }
        if (notes200 > 0) {
            System.out.println("200 X " + notes200 + " = " + (notes200 * 200));
        }
        if (notes100 > 0) {
            System.out.println("100 X " + notes100 + " = " + (notes100 * 100));
        }
        if (notes50 > 0) {
            System.out.println("50 X " + notes50 + " = " + (notes50 * 50));
        }

        // Display the total amount to verify
        System.out.println("Total amount: " + (notes2000 * 2000 + notes500 * 500 + notes200 * 200 + notes100 * 100 + notes50 * 50));
    }
}
