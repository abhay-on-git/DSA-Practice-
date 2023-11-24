// 12.Calculate Average Marks

import java.util.*;
public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Subjects for which You want to calculate the Marks Average : ");
        int subjects = sc.nextInt();

        double Marks = 0.0;
        
        for(int i = 0;i<subjects;i++){
              System.out.print("Enter the Marks of subject "+(i+1)+" : ");
              Marks += sc.nextDouble();
        }
        double Average = Marks/subjects;
        System.out.println("Average of Subjects is : "+Average);
        sc.close();
    }
}
