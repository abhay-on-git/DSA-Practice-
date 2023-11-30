// 13.Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers greater than '0' to print all the prime numbers between them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = printPrimeNumbers(a, b);
        System.out.println("All the Prime Numbers present between " + a + " - " + b + " are: " + ans);
        sc.close();
    }

    public static String printPrimeNumbers(int a, int b) {
        StringBuilder primeNumbers = new StringBuilder();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                primeNumbers.append(i).append(" ");
            }
        }

        return primeNumbers.toString().trim();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

