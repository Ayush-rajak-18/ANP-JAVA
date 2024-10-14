// 3. WAP to check login and password.



import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctUsername = "ayush";
        String correctPassword = "@ayu123";
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successfully.");
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
}
