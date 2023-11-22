// 25.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;
public class question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int max = 0;
        while (n!=0) {
            System.out.print("Enter any no to get Greatest of all or '0' to end the program - ");
             n = sc.nextInt();
             if(n>max){
                max=n;
             }
        }
        System.out.println("Greatest of all given number is : "+max);
        sc.close();
    }
}
