// 9.To find Armstrong Number between two given number.0

import java.util.*;
public class ArmstrongNo {
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. to check weather it is ArmStrong or not : ");
        int n = sc.nextInt();
        if(isArmStrong(n)){
            System.out.println(n+" is a ArmStrong");
        } else{
            System.out.println(n+" is not a ArmStrong");
        }
        sc.close();
      }    
      public static boolean isArmStrong(int n ){
        int originalNo = n;
        int noOfDigits = String.valueOf(n).length();
        int sum = 0;
        while (n>0) {
            int r = n%10;
            sum += Math.pow(r, noOfDigits); 
             n = n/10;
        }
        return sum == originalNo ;
      }
}
