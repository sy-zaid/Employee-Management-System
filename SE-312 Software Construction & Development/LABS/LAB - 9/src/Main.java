//public class Main {
//    public static void main(String[] args) {
//        Student student1 = new Student("S001", "Alice");
//        Student student2 = new Student("S002", "Bob");
//
//        Course course = new Course("CSE101", "Introduction to Computer Science");
//        course.enrollStudent(student1);
//        course.enrollStudent(student2);
//        System.out.println(course);
//
//        Gradebook gradebook = new Gradebook();
//        gradebook.recordGrade(student1, "A");
//        gradebook.recordGrade(student2, "B");
//        System.out.println(gradebook);
//
//        LibraryNotification libraryNotification = new LibraryNotification();
//        libraryNotification.notifyStudent(student1, "Design Patterns");
//        libraryNotification.notifyStudent(student2, "Effective Java");
//        System.out.println(libraryNotification);
//    }
//}
public class Main {
    public static void main(String[] args) {
        BillPayment billPayment = new BillPayment();
        billPayment.receivePayment("Payment1");
        billPayment.receivePayment("Payment2");
        System.out.println(billPayment);
        System.out.println("Processing: " + billPayment.processPayment());
        System.out.println(billPayment);

        AccountOpening accountOpening = new AccountOpening();
        accountOpening.openAccount("Account1");
        accountOpening.openAccount("Account2");
        System.out.println(accountOpening);

        LoanContact loanContact = new LoanContact();
        loanContact.addLoanTaker("LoanTaker1");
        loanContact.addLoanTaker("LoanTaker2");
        System.out.println(loanContact);
    }
}
