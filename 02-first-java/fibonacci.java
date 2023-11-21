// 7.To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms do you want to print from the Fibonacci series: ");
        int input = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < input; i++) {
            System.out.print(printFibonacciSeries(i) + " ");
        }
        sc.close();
    }

    // Recursive Function...
    public static int printFibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        } else {
            return printFibonacciSeries(n - 1) + printFibonacciSeries(n - 2);
        }
    }
}

