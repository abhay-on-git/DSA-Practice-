// 1.Factorial Program In Java

import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to get Factorial of it : ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = n;i>1;i--){
              factorial*=i;
        }
        System.out.println("Factorial of "+n+" is : "+factorial);
        sc.close();
    }
}