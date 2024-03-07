import java.util.Scanner;
public class ArithemeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        System.out.println("Arithemetic Operations:-");
        System.out.println(num1+" + " + num2 + " = " + (num1+num2));
        System.out.println(num1+" - " + num2 + " = " + (num1-num2));
        System.out.println(num1+" * " + num2 + " = " + (num1*num2));
        System.out.println(num1+" / " + num2 + " = " + (num1/num2));
        System.out.println(num1+" % " + num2 + " = " + (num1%num2));
        input.close();
    }
}
// Sample Output:-
// Enter a number: 10
// Enter a number: 5
// Arithemetic Operations:-
// 10 + 5 = 15
// 10 - 5 = 5
// 10 * 5 = 50
// 10 / 5 = 2
// 10 % 5 = 0
