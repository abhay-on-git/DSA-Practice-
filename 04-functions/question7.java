// 7. Find out the given no. is Prime or not.

import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. to check weather it is prime or not : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is a Prime No.");
        }else{
            System.out.println(n+" is not a Prime No.");
        }
        sc.close();
    }

    public static boolean isPrime(int n){
        if(n<1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
}
