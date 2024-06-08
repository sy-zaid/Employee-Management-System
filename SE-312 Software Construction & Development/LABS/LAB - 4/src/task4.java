import java.util.Scanner;

public class task4 {
    public task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to create table of: ");
        int table_num = scanner.nextInt();
        System.out.println("Printing the table of " + table_num);
        for (int i = 0; i < 11; i++) {
            System.out.println(table_num + " x " + i + " = " + table_num * i);
        }
    }
}
