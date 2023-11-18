// 3.Take a number as input and print the multiplication table for it.
import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the No, to Print the Table :");
     int a = sc.nextInt();
     for(int i=1 ; i<11 ; i++ ){
        System.out.println(
            a*i
        );
     }        
    sc.close();
    }
}
