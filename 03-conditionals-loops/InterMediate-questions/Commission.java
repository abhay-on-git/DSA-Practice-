// 6.Calculate Commission Percentage

import java.util.Scanner;
public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total sales amount: $");
        double totalSales = sc.nextDouble();

        System.out.print("Enter the commission rate (%): ");
        double commissionRate = sc.nextDouble();

        double commissionAmount = (commissionRate / 100) * totalSales;

        System.out.println("Commission Amount: $" + commissionAmount);

        sc.close();
    }
}
