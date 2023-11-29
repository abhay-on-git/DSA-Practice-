// 1.WAP to find the max and min anomg three numbers enterd by the user

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three numbers to get max & min No. among them : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        findMaxNo(a,b,c);
        findMinNo(a,b,c);
        sc.close();
    }

    public static void findMaxNo(double a ,double b ,double c){

        double max = a > b ? a : b;
        if(c > max){
            max = c ;
        }
        System.out.println("The Maximun No. among three nunbers is : "+max);

    }
    public static void findMinNo(double a ,double b ,double c){

        double min = a < b ? a : b;
        if(c < min){
            min = c ;
        }
        System.out.println("The Minimun No. among three nunbers is : "+min);

    }
}
