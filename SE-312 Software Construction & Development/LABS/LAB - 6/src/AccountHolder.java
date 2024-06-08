import java.util.Scanner;
public class AccountHolder {
    private String username;
    private String password;
    private String email;

    public AccountHolder(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public void Authentication(int retry_count){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String input_password = scanner.nextLine();
        if (retry_count > 2){
            System.out.println("Out of tries, try again later!");
            return;
        }
        else if (input_password.equals(this.password) && retry_count < 2){
            System.out.println("The user has logged in successfully.");

        }
        else {
            System.out.println("Wrong password!" + retry_count);
            retry_count ++;
            Authentication(retry_count);
        }

    }

}