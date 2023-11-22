// 1.Area Of Circle Java Program

import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle : ");
        int r = sc.nextInt();
        double Area = 3.14*(r*r);
        System.out.println("Area of Circle is : "+Area);
        sc.close();
    }
}
