// 25.Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;
public class question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total No. of Days in August : ");
        int days = sc.nextInt();
        
        int count = 0;
        for(int i=1;i<=days;i++){
        if(i%2==0){
            count++;
        }
        }

        System.out.println("Total No. of Days in which Kunal can go out are : "+count);
        sc.close();
    }
}
