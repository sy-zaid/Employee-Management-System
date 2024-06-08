public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------- TASK - 1 -------------------------");
        BankAccount bankAccount1 = new BankAccount(3000, 112233, "Zaid");
        bankAccount1.checkBalance();
        bankAccount1.deposit(5000);
        bankAccount1.checkBalance();
        bankAccount1.withdraw(2000);
        bankAccount1.checkBalance();

        AccountHolder accountHolder1 = new AccountHolder("zaid","abcd","zaid@gmail.com");
        accountHolder1.Authentication(0);

        System.out.println("------------------------- TASK - 2 -------------------------");
        Employee employee1 = new Employee("Zaid", "Manager", 100000);
        employee1.getSalary();
        employee1.setSalary(120000);

        System.out.println("------------------------- TASK - 3 -------------------------");
        Movie movie1 = new Movie("Avengers", "Tom", new String[]{"Tony", "Tina"});
        movie1.addReview("Best movie ever!");
        movie1.addReview("Good movie, rate 5 stars");
        movie1.addReview("Very bad storyline, rate 2 stars");
        System.out.println("Movie Reviews:");
        for (String review: movie1.getReviews()) {
            if (review != null) {
                System.out.println(review);
            }
        }

        System.out.println("------------------------- TASK - 4 | HOME TASK -------------------------");
        TrafficLights trafficLights1 = new TrafficLights("Red",20);
        TrafficLights trafficLights2 = new TrafficLights("Green",15);
        TrafficLights trafficLights3 = new TrafficLights("Yellow",5);

        trafficLights1.changeColor();
        trafficLights2.changeColor();
        trafficLights3.changeColor();

        trafficLights1.currentStatus();
        trafficLights2.currentStatus();
        trafficLights3.currentStatus();
    }
}