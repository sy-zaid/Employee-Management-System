import java.util.Scanner;

public class task5 {
    int res = 0;

    public task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate sum from 1 to that number: ");
        int num = scanner.nextInt();
        System.out.println("Calculating the sum...");
        for (int i = 0; i < num + 1; i++) {
            res += i;
        }
    }

    public int getRes() {
        return res;
    }
}
