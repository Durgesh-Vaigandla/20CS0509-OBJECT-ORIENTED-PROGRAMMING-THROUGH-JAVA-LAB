package Applications;
import java.util.Scanner;

public class OfferValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the total purchase amount
        System.out.print("Enter the total purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        
        // Validate offer based on the purchase amount
        double discount = 0.0;
        if (purchaseAmount >= 1000 && purchaseAmount <= 1500) {
            discount = purchaseAmount * 0.05; // 5% discount for purchase between 1001 to 1500
        } else if (purchaseAmount > 1500 && purchaseAmount < 2000) {
            discount = purchaseAmount * 0.08; // 8% discount for purchase above 1500
        } else if(purchaseAmount > 2000){
            discount = purchaseAmount * 0.10; // 10% discount for purchase above 2000
        }
        
        // Display the discount
        if (discount > 0) {
            System.out.println("Congratulations! You qualify for a discount of Rs." + discount);
        } else {
            System.out.println("Sorry, you don't qualify for any discount at this time.");
        }
        
        scanner.close();
    }
}