// 24.Sum Of A Digits Of Number

import java.util.Scanner;
public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the No. to get the Sum of its digits : ");
        int n = sc.nextInt();
        

        if(n>=1 && n<=9){
                System.out.println("Sum of digits of a given No. is : "+n);
            }else{
                int sum = calculateSumOfDigits(n);
                System.out.println("Sum of digits of a given No. is : "+sum);
            }
        sc.close();
    }
    public static int calculateSumOfDigits(int n){
        int sum = 0;
        while(n>0){
        int digit = n%10;
        sum += digit;
        n = n/10;
        }
        return sum ;
    }
}
