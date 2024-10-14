import java.util.Scanner;

public class EmployeePaySlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ₹");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Experience (in years): ");
        int experience = scanner.nextInt();

        
        double da = 0.05 * basicSalary; 
        double ta = 0.065 * basicSalary; 
        double cca = 0.08 * basicSalary; 
        double hra = 0.10 * basicSalary; 
        double pf = 0.125 * basicSalary; 

        //  Bonus 
        double bonus;
        if (experience > 25) {
            bonus = 0.25 * basicSalary;
        } else if (experience > 20) {
            bonus = 0.20 * basicSalary;
        } else if (experience > 15) {
            bonus = 0.15 * basicSalary;
        } else {
            bonus = 0.10 * basicSalary;
        }

        // total salary 
        double totalSalary = basicSalary + da + ta + cca + hra + bonus;
        double netSalary = totalSalary - pf;

        // show the pay slip
        System.out.println("\n-------------------------------------------------");
        System.out.println("\t\tPay Slip");
        System.out.println("-------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("DA (5%): ₹" + da);
        System.out.println("TA (6.5%): ₹" + ta);
        System.out.println("CCA (8%): ₹" + cca);
        System.out.println("HRA (10%): ₹" + hra);
        System.out.println("PF (12.5%): ₹" + pf);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("-------------------------------------------------");
        System.out.println("TOTAL SALARY: ₹" + totalSalary);
        System.out.println("NET SALARY (after PF deduction): ₹" + netSalary);
        System.out.println("-------------------------------------------------");
    }
}
