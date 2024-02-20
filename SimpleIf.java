import java.util.Scanner;
public class SimpleIf {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     if (n > 0) {
        System.out.println(n+"is poitive number");
        System.out.println("simple if condition");
    }
    input.close();
    }
}
  