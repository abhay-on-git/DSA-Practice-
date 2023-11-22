// 2.Area Of Triangle Java Program

import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of Triangle : ");
        int h = sc.nextInt();
        System.out.print("Enter the base of Triangle : ");
        int b = sc.nextInt();
        double Area = 0.5*(b*h);
        System.out.println("Area of Triangle is : "+Area);
        sc.close();
    }
}
