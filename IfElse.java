import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        if( n%2==0){
            System.out.println("n is a Even Number");
        }else {
            System.out.println("n is a Odd Number");
        }
        System.out.println("executed by Sujith9C2");
        input.close();
    }
}
