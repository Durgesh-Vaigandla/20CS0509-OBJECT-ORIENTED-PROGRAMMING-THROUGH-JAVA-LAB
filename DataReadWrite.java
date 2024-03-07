/*EXP-1 Write a java program to read and write different types of data through keyboard and display them on console. */
import java.util.Scanner;

public class DataReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        System.out.print("Enter a floating-point number: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered: " + floatValue);

        System.out.print("Enter a string: ");
        String stringValue = scanner.next();
        System.out.println("You entered: " + stringValue);

        scanner.close();
    }
}
