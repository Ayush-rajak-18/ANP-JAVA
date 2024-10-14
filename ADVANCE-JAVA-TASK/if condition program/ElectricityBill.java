import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units: ");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 200) {
            bill = 0; 
        } else if (units <= 300) {
            bill = (units - 200) * 1.2; 
        } else if (units <= 400) {
            bill = 100 * 1.2 + (units - 300) * 1.5; 
        } else if (units <= 500) {
            bill = 100 * 1.2 + 100 * 1.5 + (units - 400) * 2.5; 
        } else {
            bill = 100 * 1.2 + 100 * 1.5 + 100 * 2.5 + (units - 500) * 8; 
        }

     
        System.out.println("Your electricity bill is: $" + bill);
    }
}
