// 9.Calculate Batting Average
/*
  In cricket, the batting average is a statistical measure of a batsman's performance. It is calculated by dividing the total number of runs scored by the total number of times the batsman has been dismissed. 
 */

import java.util.Scanner;
public class BattingAvg {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the total runs scored: ");
            int totalRuns = sc.nextInt();
    
            System.out.print("Enter the total number of times dismissed: ");
            int totalDismissals = sc.nextInt();
    
            double battingAverage = calculateBattingAverage(totalRuns, totalDismissals);
    
            System.out.println("Batting Average: " + battingAverage);
    
            sc.close();
    }
    public static double calculateBattingAverage(int totalRuns, int totalDismissals) {
        if (totalDismissals > 0) {
            return (double) totalRuns / totalDismissals;
        } else {
            System.out.println("Cannot calculate batting average with zero dismissals.");
            return 0.0;
        }
    }
}
