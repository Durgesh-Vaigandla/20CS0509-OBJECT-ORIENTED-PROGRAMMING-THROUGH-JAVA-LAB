import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter A number");
        int a = input.nextInt();
        System.out.print("enter B number");
        int b = input.nextInt();
        System.out.print("enter C number");
        int c = input.nextInt();
        if (a>b && a>c){
            System.out.println("A is bigger");
        } else if (b>c) {
            System.out.println("B is bigger");
        } else{
         System.out.println("C is bigger");
        }
        input.close();
    }
}