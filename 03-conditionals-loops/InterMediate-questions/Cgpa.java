// 10.Calculate CGPA Java Program
/*
 To calculate Cumulative Grade Point Average (CGPA) in Java, you can use a simple program that takes the grades and credit hours for each course and calculates the CGPA based on the formula: 
 CGPA = Total Grade Points/Total Credit Hours
 */

import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numberOfCourses = sc.nextInt();

        char[] grades = new char[numberOfCourses];
        int[] creditHours = new int[numberOfCourses];

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.print("Enter the grade for course " + (i + 1) + ": ");
            grades[i] = sc.next().charAt(0);

            System.out.print("Enter the credit hours for course " + (i + 1) + ": ");
            creditHours[i] = sc.nextInt();
        }

        double cgpa = calculateCGPA(grades, creditHours);

        System.out.println("CGPA: " + cgpa);

        sc.close();
    }

    public static double calculateCGPA(char[] grades, int[] creditHours) {
        int totalGradePoints = 0;
        int totalCreditHours = 0;

        for (int i = 0; i < grades.length; i++) {
            totalGradePoints += getGradePoint(grades[i]) * creditHours[i];
            totalCreditHours += creditHours[i];
        }

        return (double) totalGradePoints / totalCreditHours;
    }

    public static int getGradePoint(char grade) {
        switch (Character.toUpperCase(grade)) {
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            case 'D':
                return 1;
            default:
                return 0;
        }
    }
}
