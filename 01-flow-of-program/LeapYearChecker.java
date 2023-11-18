// 1. Input a year and find whether it is a leap year or not.
import java.util.Scanner;
public class LeapYearChecker {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Year : ");
    int year = sc.nextInt();

    if(isLeapYear(year)){
        System.out.println(year+" is a Leap Year");
    }else{
        System.out.println(year+" is not a Leap Year");
    }
    sc.close();
}

public static boolean isLeapYear(int year){
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return true ;
    } else {
        return false ;
    }
}
}