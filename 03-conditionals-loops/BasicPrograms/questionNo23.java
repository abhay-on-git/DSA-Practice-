// 23.Input a number and print all the factors of that number (use loops).

import java.util.Scanner;
public class questionNo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. - ");
        int n = sc.nextInt();
        System.out.println("Following are the factors of "+n);
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+", ");
            }
        }
        sc.close();
    }
}
