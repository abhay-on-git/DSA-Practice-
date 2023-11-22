// 14.Volume Of Cone Java Program

import java.util.Scanner;
public class volumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of a Cone : ");
        int h = sc.nextInt();
        System.out.print("Enter the radius of a Cone : ");
        int r = sc.nextInt();
        double Volume = 1/3*(3.14*r*r*h);
        System.out.println("Volume of a Cone is : "+Volume);
        sc.close();
    }
}
