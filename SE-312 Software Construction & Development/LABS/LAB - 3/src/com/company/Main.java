package com.company;

public class Main {
    public static void main(String[] args) {
        // Task - 1 | Using a class from MessagePrinter.java and calling its method named printThreeMessages() to print three messages.
        System.out.println("------------------------- OUTPUT TASK - 1 -------------------------");
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printThreeMessages();

        // Task - 2 | Using a class from CalculateSum.java and calling its method named addTwoNumbers() to get the result of addition.
        System.out.println("------------------------- OUTPUT TASK - 2 -------------------------");
        CalculateSum calculateSum = new CalculateSum();
        int num1 = 10;
        int num2 = 20;
        int result = calculateSum.addTwoNumbers(num1,num2);
        System.out.println("The result is: "+result);

        // Task - 3 | Using a class from NumberPrinter.java and calling its method named printNumbers() to print different type of numbers.
        System.out.println("------------------------- OUTPUT TASK - 3 -------------------------");
        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.printNumbers();

    }
}
