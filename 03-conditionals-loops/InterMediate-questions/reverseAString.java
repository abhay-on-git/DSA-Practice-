// 16.Reverse A String In Java

import java.util.Scanner;
public class reverseAString {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the String to get Reversed : ");
    String str = sc.next();
    StringBuilder sb = new StringBuilder(str);
    String newStr = sb.reverse().toString();
    
    System.out.println("Given String : "+str+" and Reversed String : "+newStr);
    
    sc.close();
    }
}
