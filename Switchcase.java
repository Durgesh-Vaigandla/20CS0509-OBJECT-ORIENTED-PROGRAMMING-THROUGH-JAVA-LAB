import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Enter the operation[+ ,- ,* ,/ ,%]: ");
        char operation = input.next().charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("The result is: " + result);
        input.close();
    }
}