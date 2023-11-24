// 13.Sum Of N Numbers

import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. to Calculate the Sum : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
           sum += i ;
        }
        System.out.println("The sum of "+n+" number is : "+sum);
        sc.close();
    }
}
