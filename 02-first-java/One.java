// 1.Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;
public class one{

    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a No. to check Even/Odd : ");
      int a = sc.nextInt();
      if (a%2==0){
        System.out.println(a+ " is Even.");
      }else{
        System.out.println(a+ " is Odd.");
      }
      sc.close();
    }
}