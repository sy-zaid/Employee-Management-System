import java.util.HashSet;
import java.util.Set;

public class LoanContact {
    private Set<String> loanTakers;

    public LoanContact() {
        this.loanTakers = new HashSet<>();
    }

    public void addLoanTaker(String loanTaker) {
        loanTakers.add(loanTaker);
    }

    public boolean isLoanTakerContacted(String loanTaker) {
        return loanTakers.contains(loanTaker);
    }

    @Override
    public String toString() {
        return "Loan Takers to Contact: " + loanTakers;
    }
}
