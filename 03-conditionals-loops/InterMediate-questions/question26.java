// 26.Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;
public class question26 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = 1;
        int evenSum = 0;
        int oddSum = 0;
        int negativeSum = 0;
        while(n!=0){
        System.out.print("Enter the No. to get the sum : ");
        n = sc.nextInt();
        if (n > 0) {
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        } else {
            negativeSum += n;
        }
        }
        System.out.println("The Sum of Even No. is : "+evenSum);
        System.out.println("The Sum of Odd No. is : "+oddSum);
        System.out.println("The Sum of Negative No. is : "+negativeSum);
        sc.close();
    }
}
