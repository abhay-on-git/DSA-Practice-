// 22.Perfect Number In Java

import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the No. to check weather it is Perfect or Not : ");
        int n = sc.nextInt();
        if(isPerfectNo(n)){
            System.out.println("Given No. is a Perfect Number.");
        }else{
            System.out.println("Given No. is not a Perfect Number.");
        }
        sc.close();
    }

    public static boolean isPerfectNo(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
           if(n%i==0){
            sum += i;
           }
        }
        return sum == n;
    }
}
