import java.util.Scanner;

public class UnaryOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Perform unary operators
        int postincrement = num++;
        int postdecrement = num--;  
        int preincrement = ++num;  
        int predecrement = --num; 
        
        // Print results
        System.out.println("Post-increment result: " + postincrement);
        System.out.println("post-decrement result: " + postdecrement);
        System.out.println("Pre-increment result: " + preincrement);
        System.out.println("Pre-decrement result: " + predecrement);
        
        scanner.close();
    }
}
