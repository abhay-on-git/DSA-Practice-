// 6.Input currency in rupees and output in USD.

import java.util.*;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the rupee : ");
      int a = sc.nextInt();
      System.out.print("Enter the current value of $ : ");
      int b = sc.nextInt();
      
        System.out.println((a*b)+ " $");
      
      sc.close();
    }
}
