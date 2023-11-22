// 24.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n!=0) {
            System.out.print("Enter any no to get Sum or '0' to end the program - ");
             n = sc.nextInt();
             sum += n;
        }
        System.out.println("Sum of all given number is : "+sum);
        sc.close();
    }
}
