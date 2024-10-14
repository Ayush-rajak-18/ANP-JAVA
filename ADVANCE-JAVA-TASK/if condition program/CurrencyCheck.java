 // 4. WAP to check if the user has provided the correct currency note for deposit.
 // a. The note should be between the following currencies
// i. 2000, 500, 200, 100, 50.
       

import java.util.Scanner;

public class CurrencyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the currency note: ");
        int note = scanner.nextInt();
        
        if (note == 2000 || note == 500 || note == 200 || note == 100 || note == 50) {
            System.out.println("Valid currency note.");
        } else {
            System.out.println("Invalid currency note.");
        }
    }
}
