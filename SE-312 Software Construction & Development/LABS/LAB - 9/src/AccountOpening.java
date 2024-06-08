import java.util.ArrayList;
import java.util.List;

public class AccountOpening {
    private List<String> newAccounts;

    public AccountOpening() {
        this.newAccounts = new ArrayList<>();
    }

    public void openAccount(String account) {
        newAccounts.add(account);
    }

    public List<String> getNewAccounts() {
        return newAccounts;
    }

    @Override
    public String toString() {
        return "Newly Opened Accounts: " + newAccounts;
    }
}
