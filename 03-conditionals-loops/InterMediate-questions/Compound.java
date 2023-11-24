// 11.Compound Interest Java Program

/*
 The formula for calculating compound interest is given by: log A = nt log P( 1 + r/n ) ;
 Where:

- A is the future value of the investment/loan, including interest.
- P is the principal amount (initial investment/loan amount).
- r is the annual interest rate (decimal).
- n is the number of times that interest is compounded per unit.
- t is the time the money is invested or borrowed for, in years.

- r/n represents the interest rate per compounding period.
- nt represents the total number of compounding periods.
 */
import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount you want to invest : ");
        int p = sc.nextInt();
        System.out.print("Enter the intrest rate you want to get : ");
        float r = sc.nextFloat();
        System.out.print("Enter How many times the intrest is gonna compounded per unit : ");
        int n = sc.nextInt();
        System.out.print("Enter Time period for which you want to invest your money : ");
        int t = sc.nextInt();

        // - r/n represents the interest rate per compounding period.
        double intrestRate = r/n; 

        // - nt represents the total number of compounding periods.
        int nt = n*t;

        double Amount = p * Math.pow((1+intrestRate), nt);
        System.out.println("The total Amount will be : "+Amount);
        sc.close();
    }
}
