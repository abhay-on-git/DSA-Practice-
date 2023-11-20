// 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Taking input for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0.0;

        // Performing the calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Checking if the second number is not zero before dividing
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                System.exit(0); // Exiting the program if there's an error
            }
        } else {
            System.out.println("Error: Invalid operator.");
            System.exit(0); // Exiting the program if there's an error
        }

        // Printing the result
        System.out.println("Result: " + result);

        // Closing the scanner
        sc.close();
    }
}
