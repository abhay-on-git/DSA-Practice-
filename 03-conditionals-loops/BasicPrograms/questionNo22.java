// 22.subtract-the-product-and-sum-of-digits-of-an-eger
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
import java.util.Scanner;
public class questionNo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Diffrence b/w the Product and the Sum of digits of the given no. - "+toGetDigitsOfNumber(n));
        sc.close();
    }

    public static int toGetDigitsOfNumber(int n){
        int product = 1;
        int sum = 0;
        while(n>0){
             int digit = n%10;
             product *= digit;
             sum += digit;
             n = n/10;
        }
        return product - sum ;
    }
}
