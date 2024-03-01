import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(" is not prime");
                break;
            }
            if (i == num - 1) {
                System.out.println(num + " is a prime number");
            }
        }

    }
}

