// 5.Take 2 numbers as input and print the largest number.

import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the First No. : ");
      int a = sc.nextInt();
      System.out.print("Enter the Second No. : ");
      int b = sc.nextInt();
      if (a>b){
        System.out.println(a+ " is the Largest.");
      }else{
        System.out.println(b+ " is the Largest.");
      }
      sc.close();
    }
}
