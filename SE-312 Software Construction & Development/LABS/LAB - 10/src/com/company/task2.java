package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Division Game!");
            System.out.print("Enter the first integer: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            if (dividend % divisor != 0) {
                throw new IllegalArgumentException("The result is not an integer. Please enter valid integers.");
            }

            int result = dividend / divisor;
            System.out.println("The result of " + dividend + " divided by " + divisor + " is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }
    }
}
