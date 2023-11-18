// 2.Take two numbers and print the sum of both.

import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First No. ");
        int a = sc.nextInt();
        System.out.print("Enter your Second No. ");
        int b = sc.nextInt();
        System.out.println("The Sum is equal to : "+(a+b));
        sc.close();
    }
}
