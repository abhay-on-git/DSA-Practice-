// 8.To find out whether the given String is Palindrome or not.

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to check whether it is palindrome or not :");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
            
        String newStr = sb.reverse().toString();

        if(str.equals(newStr)){
            System.out.println(str+" is Palindrome.");
        }else{
            System.out.println(str+" is not Palindrome.");
        }
sc.close();
    }
}
