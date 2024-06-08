/*Write a Java program that prompts the user to enter ages of three people
 and determines the oldest person among them. Display the age of the oldest person.*/

import java.util.Scanner;

public class task2 {
    int person = 0;

    public task2() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("""
                    Enter Person %d age:
                    """.formatted(i));
            int newAge = scanner.nextInt();

            if (newAge > person) {
                person = newAge;
            }
        }
//        scanner.close();

    }

    public int getPerson() {
        return person;
    }
}
