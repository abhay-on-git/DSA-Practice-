// 4.Calculate Discount Of Product

import java.util.Scanner;
public class discountOnP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original price of the product: $");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter the discount rate (%): ");
        double discountRate = sc.nextDouble();

        double discountAmount = (discountRate / 100) * originalPrice;

        System.out.println("Discount Amount: $" + discountAmount);
        
        sc.close();
    }
    
}
