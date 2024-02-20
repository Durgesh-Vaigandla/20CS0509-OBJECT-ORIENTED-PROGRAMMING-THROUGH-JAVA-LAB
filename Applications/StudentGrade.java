package Applications;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks(sub-1):- ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks(sub-2):- ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks(sub-3):- ");
        int sub3 = sc.nextInt();
        System.out.print("Enter marks(sub-4):- ");
        int sub4 = sc.nextInt();
        System.out.print("Enter marks(sub-5):- ");
        int sub5 = sc.nextInt();
        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);
        char Grade;
        float average = (sum / 5);
        float Percentage = ((float)sum / 500) * 100;
        if (average >= 90) {
            Grade = 'A';
        } else if (average >= 80 && average <= 89) {
            Grade = 'B';
        } else if (average >= 70 && average <= 79) {
            Grade = 'C';
        } else if (average >= 60 && average <= 69 ) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }
        System.out.println("Grade: " + Grade);
        System.out.println("Total Marks:-"+sum+"/500");
        System.out.println("Percentage: "+ Percentage);
        sc.close();
    }
}