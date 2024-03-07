import java.util.Scanner;
public class RelationalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Using relational operators to compare the numbers
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);
        boolean isGreaterThan = (num1 > num2);
        boolean isLessThan = (num1 < num2);
        boolean isGreaterThanOrEqual = (num1 >= num2);
        boolean isLessThanOrEqual = (num1 <= num2);
        
        // Displaying the results
        System.out.println("num1 is not equal to num2 : " + isNotEqual);
        System.out.println("num1 is equal to num2: " + isEqual);
        System.out.println("num1 is greater than num2: " + isGreaterThan);
        System.out.println("num1 is less than num2: " + isLessThan);
        System.out.println("num1 is greater than or equal to num2: " + isGreaterThanOrEqual);
        System.out.println("num1 is less than or equal to num2: " + isLessThanOrEqual);
        
        scanner.close();
    }
}

