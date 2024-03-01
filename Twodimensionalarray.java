import java.util.Scanner;
public class Twodimensionalarray {
    public static void main(String[] args) {
        Scanner cmi =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r =cmi.nextInt();
        System.out.println("Enter the number of columns: ");
        int c =cmi.nextInt();
        int array [][]=new int [r][c];
        System.out.println("Enter array elemts");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                array[i][j]=cmi.nextInt();
            }
        } 
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int sum = [i]+[j]; 
        System.out.println(sum);
    }
}
