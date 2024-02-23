import java.util.Scanner;
public class SumOfNaturalNumbers {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
