/*EXP-2 (B) Write a java program to find Fibonacci series of given number. */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // The number for which Fibonacci series needs to be calculated
        int[] fib = new int[n];
        
        fib[0] = 0; // First element of Fibonacci series
        fib[1] = 1; // Second element of Fibonacci series
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Calculate the next element of Fibonacci series
        }
        
        System.out.println("Fibonacci series of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
