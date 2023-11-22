// 13.Perimeter Of Rhombus

import java.util.Scanner;
public class periOfRohombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a side of a Rohombus : ");
        int l = sc.nextInt();
        double Perimeter = 4*l;
        System.out.println("Perimeter of a Rohombus is : "+Perimeter);
        sc.close();
    }
}
