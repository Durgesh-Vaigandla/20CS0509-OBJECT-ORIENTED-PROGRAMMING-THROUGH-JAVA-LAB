import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci sequence:");
        int a = 0, b = 1;
        int count = 0;
        
        while (count < n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println("executed by Sujith9C2");
    }
}
