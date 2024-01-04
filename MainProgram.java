/*EXP-4(A) Create a user defined package and import it into a java program. */
import mypackage.MyClass1;
import mypackage.MyClass2;

public class MainProgram {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1();
        MyClass2 obj2 = new MyClass2();

        int num1 = 10;
        int num2 = 5;

        int sum = obj1.addition(num1, num2);
        int difference = obj2.subtraction(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
    

