public class TablePrinter extends Thread {
    private int startNumber;
    private int increment;

    public TablePrinter(int startNumber, int increment) {
        this.startNumber = startNumber;
        this.increment = increment;
    }

    public void run() {
        // Loop to print the table
        for (int i = startNumber; i <= startNumber + 9 * increment; i += increment) {
            // Print the table entry
            System.out.println(i + " - " + getDOB(i));
        }
    }

    private String getDOB(int rollNumber) {
        // Extract year, month, and day from the roll number string
        String rollNumberStr = String.valueOf(rollNumber);
        String year = rollNumberStr.substring(0, 4);
        String month = rollNumberStr.substring(5, 7);
        String day = rollNumberStr.substring(8);

        // Map month number to month name
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Convert month number to month name
        int monthIndex = Integer.parseInt(month) - 1;
        String monthName = months[monthIndex];

        // Format day with leading zero if needed
        String formattedDay = String.format("%02d", Integer.parseInt(day));

        // Construct and return the date of birth string
        return formattedDay + "-" + monthName;
    }


    public static void main(String[] args) {
        // Create two threads for printing roll numbers and dates of birth
        TablePrinter rollNumberThread = new TablePrinter(2022_01_001, 1);
        TablePrinter dobThread = new TablePrinter(2022_01_001, 10);

        // Start both threads
        rollNumberThread.start();
        dobThread.start();
    }
}
