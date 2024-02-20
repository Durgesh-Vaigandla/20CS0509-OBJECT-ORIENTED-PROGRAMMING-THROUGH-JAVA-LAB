package Applications;
import java.util.Scanner;

public class MonthlySalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Constants for allowance percentages
        final double HRA_PERCENTAGE = 0.10; // 10%
        final double FA_PERCENTAGE = 0.05; // 5%
        final double TA_PERCENTAGE = 0.10; // 10%
        
        // Input the annual salary
        System.out.print("Enter the annual salary: ");
        double annualSalary = scanner.nextDouble();
        
        // Calculate allowances
        double hra = annualSalary * HRA_PERCENTAGE;
        double fa = annualSalary * FA_PERCENTAGE;
        double ta = annualSalary * TA_PERCENTAGE;
        
        // Calculate monthly salary after deductions
        double monthlySalary = (annualSalary - (hra + fa + ta)) / 12;
        
        // Display the monthly salary
        System.out.println("House Rental: " + hra);
        System.out.println("Food: " + fa);
        System.out.println("Tax: " + ta);
        System.out.println("Monthly salary after deductions: Rs." + monthlySalary);
        
        scanner.close();
    }
}