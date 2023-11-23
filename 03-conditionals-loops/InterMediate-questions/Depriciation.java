// 8.Calculate Annual Depreciation of Value

import java.util.Scanner;
public class Depriciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial value of the asset: $");
        double initialValue = sc.nextDouble();

        System.out.print("Enter the  life of the asset in years: ");
        int Life = sc.nextInt();

        double annualDepreciation = calculateDepreciation(initialValue, Life);

        System.out.println("Annual Depriciation is : "+annualDepreciation);
 
        sc.close();
    }
    public static double calculateDepreciation(double initialValue, int Life) {
        return initialValue / Life;
    }
}
