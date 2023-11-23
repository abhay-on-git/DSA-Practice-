// 3.Calculate Average Of N Numbers

import java.util.Scanner;
public class AvgOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. to get Average of it : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n;i>=1;i--){
              sum+=i;
        }
        double Average = sum/n;
        System.out.println("Average of "+n+" numbers is : "+Average);
        sc.close();
    }
}
