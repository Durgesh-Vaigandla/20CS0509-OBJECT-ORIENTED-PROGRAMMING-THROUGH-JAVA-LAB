import java.util.Scanner;
public class ElseIfLadder{
    public static void main(String args []){
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        if (n>0){
            if (n>=10 && n<=99){
            System.out.println("n is two digit number");
            }else if (n>=100 && n<=999){
            System.out.println("n is three digit number");
            } else if (n<=9 && n>=0){
            System.out.println("n is the one digit number");
            }else if (n>=1000 && n<=9999){
                System.out.println("n is four digit number");
            }
            else {
                System.out.println("invalid input. please enter a valid number");
            }
        }else if  (n>0){
        System.out.println("n is  negative number");
    }
    input.close();
    }
}