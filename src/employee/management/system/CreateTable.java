package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            // Establish connection
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/employeemanagementsystem", "sa", "");
            Statement stmt = conn.createStatement();

            // Drop existing employee table if it exists
            String dropEmployeeSql = "DROP TABLE IF EXISTS employee";
            stmt.executeUpdate(dropEmployeeSql);

            // Create employee table
            String createEmployeeSql = "CREATE TABLE employee (" +
                    "name VARCHAR(255), " +
                    "father_name VARCHAR(255), " +
                    "dob DATE, " +
                    "salary DECIMAL(10,2), " +
                    "address VARCHAR(255), " +
                    "phone VARCHAR(15), " +
                    "email VARCHAR(255), " +
                    "education VARCHAR(50), " +
                    "designation VARCHAR(50), " +
                    "cnic VARCHAR(20), " +
                    "empId VARCHAR(10) PRIMARY KEY)";
            stmt.executeUpdate(createEmployeeSql);

            // Drop existing login table if it exists
            String dropLoginSql = "DROP TABLE IF EXISTS login";
            stmt.executeUpdate(dropLoginSql);

            // Create login table
            String createLoginSql = "CREATE TABLE login (" +
                    "username VARCHAR(50), " +
                    "password VARCHAR(50))";
            stmt.executeUpdate(createLoginSql);

            // Insert sample data into login table
            String insertLoginDataSql = "INSERT INTO login (username, password) VALUES ('admin', 'admin123')";
            stmt.executeUpdate(insertLoginDataSql);

            // Insert sample data into employee table
            String insertEmployeeDataSql = "INSERT INTO employee (name, father_name, dob, salary, address, phone, email, education, designation, cnic, empId) VALUES " +
                    "('Ahmed Ali', 'Mohammad Ali', '1985-01-15', 60000.00, '123 Street, Karachi', '03001234567', 'ahmed.ali@example.com', 'BBA', 'Manager', '42101-1234567-1', 'EMP001')," +
                    "('Ayesha Khan', 'Nadeem Khan', '1990-02-20', 55000.00, '456 Avenue, Lahore', '03211234567', 'ayesha.khan@example.com', 'MBA', 'HR', '42101-1234567-2', 'EMP002')," +
                    "('Bilal Ahmed', 'Aslam Ahmed', '1988-03-25', 65000.00, '789 Boulevard, Islamabad', '03331234567', 'bilal.ahmed@example.com', 'BSc', 'Developer', '42101-1234567-3', 'EMP003')," +
                    "('Fatima Tariq', 'Tariq Jamil', '1992-04-30', 70000.00, '101 Road, Peshawar', '03451234567', 'fatima.tariq@example.com', 'MCA', 'Designer', '42101-1234567-4', 'EMP004')," +
                    "('Hamza Sheikh', 'Imran Sheikh', '1986-05-15', 72000.00, '202 Lane, Quetta', '03561234567', 'hamza.sheikh@example.com', 'BA', 'Analyst', '42101-1234567-5', 'EMP005')," +
                    "('Zainab Ali', 'Faisal Ali', '1991-06-10', 58000.00, '303 Way, Multan', '03671234567', 'zainab.ali@example.com', 'BTech', 'Engineer', '42101-1234567-6', 'EMP006')," +
                    "('Usman Malik', 'Waqar Malik', '1989-07-05', 63000.00, '404 Park, Sialkot', '03781234567', 'usman.malik@example.com', 'BCA', 'Consultant', '42101-1234567-7', 'EMP007')," +
                    "('Sara Anwar', 'Anwar Saeed', '1993-08-25', 69000.00, '505 Plaza, Hyderabad', '03891234567', 'sara.anwar@example.com', 'MA', 'Coordinator', '42101-1234567-8', 'EMP008')," +
                    "('Ali Hassan', 'Hassan Ahmed', '1987-09-10', 75000.00, '606 Square, Faisalabad', '03901234567', 'ali.hassan@example.com', 'MTech', 'Director', '42101-1234567-9', 'EMP009')," +
                    "('Nida Kamal', 'Kamal Uddin', '1994-10-20', 62000.00, '707 Circle, Rawalpindi', '03101234567', 'nida.kamal@example.com', 'B.Com', 'Accountant', '42101-1234567-0', 'EMP010')";
            stmt.executeUpdate(insertEmployeeDataSql);

            // Close resources
            stmt.close();
            conn.close();

            System.out.println("Employee and login tables created successfully, and sample data inserted into both tables!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
