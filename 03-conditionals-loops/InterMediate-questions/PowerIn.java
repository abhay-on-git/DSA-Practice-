// 7.Power In Java

import java.util.Scanner;
public class PowerIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. - ");
        int n = sc.nextInt();
        System.out.print("Enter the Power -  ");
        int p = sc.nextInt();

        double result = Math.pow(n, p);

        System.out.println(n + " raised to the power of " + p + " is: " + result);
        sc.close();
    }
}
