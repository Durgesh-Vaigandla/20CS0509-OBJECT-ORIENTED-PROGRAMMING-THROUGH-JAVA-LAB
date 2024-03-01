import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int letter = input.nextInt();
        letter=0;
        switch(0){
            case 'a':
                System.out.println("It is a vowels");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default :
                System.out.println(" It is not a consonant");
                break;
        }input.close();
    }
}
