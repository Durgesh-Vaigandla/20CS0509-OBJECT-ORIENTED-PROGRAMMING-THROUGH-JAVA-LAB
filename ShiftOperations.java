import java.util.Scanner;
public class ShiftOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number and Position: ");
        int number = input.nextInt();
        int shift = input.nextInt();
        System.out.println("Right shift: "+ (number>>shift));
        System.out.println("Left shift: "+ (number<<shift));
        input.close();
    }    
}