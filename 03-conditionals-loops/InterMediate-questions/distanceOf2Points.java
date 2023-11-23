// 5.Calculate Distance Between Two Points

import java.util.Scanner;
public class distanceOf2Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance between the two points: " + distance);

        sc.close();
    }
}
