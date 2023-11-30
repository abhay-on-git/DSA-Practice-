// 12.Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;
public class question12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the three Numbers to check wheather they are Pythagorean triplet or not : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
        sc.close();
    }
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = c * c;

        return (aSquared + bSquared == cSquared) || (aSquared + cSquared == bSquared) || (bSquared + cSquared == aSquared);
    }
}

