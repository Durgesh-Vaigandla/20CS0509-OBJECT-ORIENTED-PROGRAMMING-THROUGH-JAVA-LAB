package Applications;
import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for cat1 or 2 for cat2: ");
        int Option = input.nextInt();
        if(Option == 1) {
            System.out.print("Enter the units: ");
            int units = input.nextInt();
            int servicecharge=25;
            if (units<200){
                System.out.println("current bill is : "+(servicecharge));
            }else if (units>=200 && units<300){
                System.out.println("current bill is:"+((units*3)+servicecharge));
            }else if (units>=300&& units<400){
                System.out.println("current bill is:"+((units*4)+servicecharge));
            }else if (units>=400&& units<500){
                System.out.println("current bill is:"+((units*5)+servicecharge));
            }else{
                System.out.println("current bill is:"+((units*8)+servicecharge));
            }
        }else if(Option == 2) {
            System.out.print("Enter the units: ");
            int units = input.nextInt();
            int servicecharge=50;
            if (units<200){
                System.out.println("current bill is :"+(servicecharge));
            }else if (units>=200 && units<300){
                System.out.println("current bill is:"+((units*4)+servicecharge));
            }else if (units>=300&& units<400){
                System.out.println("current bill is:"+((units*6)+servicecharge));
            }else if (units>=400&& units<500){
                System.out.println("current bill is:"+((units*8)+servicecharge));
            }else{
                System.out.println("current bill is:"+((units*10)+servicecharge));
            }
        }
            else {
                System.out.println("invalid option");
            }
            input.close();
    }
}