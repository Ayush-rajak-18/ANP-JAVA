// 5. WAP to check whether a character is alphabet, number, or special character.
     

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a number.");

        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
