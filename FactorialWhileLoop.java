import java.util.Scanner;
public class FactorialWhileLoop {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int number = input.nextInt;
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
