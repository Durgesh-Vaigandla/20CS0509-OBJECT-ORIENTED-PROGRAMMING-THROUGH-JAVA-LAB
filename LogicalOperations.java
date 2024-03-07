import java.util.Scanner;
public class LogicalOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(num1 > num2 && num2 > num3);
        System.out.println(num1 > num2 || num2 > num3);
        System.out.println(!(num1 > num2));
        input.close();
    }
}
