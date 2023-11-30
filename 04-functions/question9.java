// 9.Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.

import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter the No. go get the factorial of it : ");
        int n = sc.nextInt();
        System.out.println(n+"! is equal to : "+getFactorial(n));
        sc.close();
    }
    public static int getFactorial(int n){
        int factorial = 1;
        for(int i=n;i>1;i--){
           factorial *= i ;
        }
        return factorial ;
    }
}
