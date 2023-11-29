// 8.Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

/*
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
 */

import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        System.out.print("Enter the No. of Subjects for which you want to convert numbers into grades : ");
        int noOfSubj = sc.nextInt();
        String[] subjArr = new String[noOfSubj];

        for(int i=0;i<subjArr.length;i++){
            System.out.print("Enter the name of Subject "+(i+1)+" : ");
            subjArr[i] = sc.next();
        }
        findGrades(subjArr);
        sc.close();
    }

    public static void findGrades(String[] subjArr){
        Scanner sc = new Scanner(System.in);
        String[] grades = new String[subjArr.length];
        for(int i=0;i<grades.length;i++){
            System.out.print("Enter the Marks (out of 100) for "+subjArr[i]+" : ");
            grades[i] = getGrades(sc.nextInt());
        }
        
        System.out.println();
        System.out.println(" Subjects  Grades ");
        for(int i=0;i<grades.length;i++){
            System.out.println("   "+subjArr[i]+" => "+grades[i]);
        }
        sc.close();
    }
    public static String getGrades(int n){

        if (n >= 91 && n <= 100) {
            return "AA";
        } else if (n >= 81 && n <= 90) {
            return "AB";
        } else if (n >= 71 && n <= 80) {
            return "BB";
        } else if (n >= 61 && n <= 70) {
            return "BC";
        } else if (n >= 51 && n <= 60) {
            return "CD";
        } else if (n >= 41 && n <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
