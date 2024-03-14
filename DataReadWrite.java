/*EXP-1 Write a java program to read and write different types of data through keyboard and display them on console. */
import java.util.Scanner;

public class DataReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Name: "+name);
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        System.out.print("Age: "+age);
        System.out.print("\nEnter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Salary: "+salary);
        scanner.close();
    }
}
