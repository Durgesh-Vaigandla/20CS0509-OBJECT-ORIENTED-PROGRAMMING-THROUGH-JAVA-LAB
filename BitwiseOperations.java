import java.util.Scanner;
public class BitwiseOperations{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        // Perform bitwise AND operation
        int bitwiseAnd = num1 & num2;
        System.out.println("Bitwise AND result: " + bitwiseAnd);
        // Perform bitwise OR operation
        int bitwiseOr = num1 | num2;
        System.out.println("Bitwise OR result: " + bitwiseOr);
        // Perform bitwise XOR operation
        int bitwiseXor = num1 ^ num2;
        System.out.println("Bitwise XOR result: " + bitwiseXor);
        // Perform bitwise NOT operation on the first number
        int bitwiseNot = ~num1;
        System.out.println("Bitwise NOT result: " + bitwiseNot);
        input.close();
    }
}