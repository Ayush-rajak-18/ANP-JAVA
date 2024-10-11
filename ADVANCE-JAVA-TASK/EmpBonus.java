//Q2.Wap to check the experience of an employee, if exp is greater than 20 years then calculate bonus=20% salary, else calculate bonus = 10% of salary.    in simple java without comment

import java.util.Scanner;

public class EmpBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of experience: ");
        int experience = scanner.nextInt();

        double bonus;
        if (experience > 20) {
            bonus = 0.20 * salary;
        } else {
            bonus = 0.10 * salary;
        }

        System.out.println("The bonus is: " + bonus);
        scanner.close();
    }
}