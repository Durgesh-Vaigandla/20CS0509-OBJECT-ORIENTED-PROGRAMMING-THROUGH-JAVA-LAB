import java.util.Scanner;
public class PrimeNumbers1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Prime numbers between 1 and "+n+" are: ");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num+" ");
            }
        }
        input.close();
    }
}
