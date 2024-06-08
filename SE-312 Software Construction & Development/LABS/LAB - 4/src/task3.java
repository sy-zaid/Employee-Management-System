import java.util.Scanner;

public class task3 {
    public task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age to check the eligibility: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You're NOT eligible.");
        } else {
            System.out.println("You're eligible.");
        }
    }

}
