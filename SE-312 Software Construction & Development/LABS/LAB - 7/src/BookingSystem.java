import java.util.Date;
import java.time.LocalTime;

interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}

class CustomerClass implements CommonFunctions {
    char customerId;
    char name;
    char address;
    int age;

    @Override
    public void searchTicket() { }

    @Override
    public void bookTicket() { }

    @Override
    public void cancelTicket() { }

    @Override
    public void makePayment() { }

    @Override
    public void fillDetails() { }

    public void addDetails() { }

    public void modifyDetails() { }
}

class Agent implements CommonFunctions {
    int id;
    char name;

    @Override
    public void searchTicket() { }

    @Override
    public void bookTicket() { }

    @Override
    public void cancelTicket() { }

    @Override
    public void makePayment() { }

    @Override
    public void fillDetails() {
        System.out.println("Agent details are not applicable.");
    }
}

class Ticket {
    char source;
    char destination;
    Date dateOfJourney;
    LocalTime time;
    String busNo;
    String seatNo;

    public Ticket(char source, char destination, Date dateOfJourney, LocalTime time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }
}

class Refund {
    float amount;

    public Refund(float amount) {
        this.amount = amount;
    }

    public float refundAmount() {
        return amount;
    }
}
