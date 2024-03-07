import java.util.Scanner;
public class TernaryOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find ODD/EVEN: ");
        int num = input.nextInt();
        System.out.println(num % 2 == 0? "Even Number" : "Odd Number");
        input.close();
    }    
}
