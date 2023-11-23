// 2.Calculate Electricity Bill

import java.util.Scanner;
public class electricityBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = sc.nextInt();

        System.out.print("Enter the rate per unit: ");
        double ratePerUnit = sc.nextDouble();

        double totalBill = unitsConsumed * ratePerUnit;

        System.out.println("Total Electricity Bill: $" + totalBill);

        sc.close();
    }
}