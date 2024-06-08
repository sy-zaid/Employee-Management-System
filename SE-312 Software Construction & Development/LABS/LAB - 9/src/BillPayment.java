import java.util.LinkedList;
import java.util.Queue;

public class BillPayment {
    private Queue<String> billPayments;

    public BillPayment() {
        this.billPayments = new LinkedList<>();
    }

    public void receivePayment(String payment) {
        billPayments.add(payment);
    }

    public String processPayment() {
        return billPayments.poll();
    }

    @Override
    public String toString() {
        return "Pending Bill Payments: " + billPayments;
    }
}
