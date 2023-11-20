// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the principal  : ");
      int p = sc.nextInt();
      System.out.print("Enter the rate  : ");
      int r = sc.nextInt();
      System.out.print("Enter the time  : ");
      int t = sc.nextInt();
      int amount = p*(1+r*t);
      System.out.println("Total  Amount Will be : "+amount);
      sc.close();
    }
}
