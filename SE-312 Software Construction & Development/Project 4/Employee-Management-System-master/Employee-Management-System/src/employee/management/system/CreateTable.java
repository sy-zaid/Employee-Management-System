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

            // Drop existing table if it exists
            String dropSql = "DROP TABLE IF EXISTS employee";
            stmt.executeUpdate(dropSql);

            // Create table
            String createSql = "CREATE TABLE employee (" +
                    "name VARCHAR(255), " +
                    "father_name VARCHAR(255), " +
                    "dob DATE, " +
                    "salary DECIMAL(10,2), " +
                    "address VARCHAR(255), " +
                    "phone VARCHAR(15), " +
                    "email VARCHAR(255), " +
                    "education VARCHAR(50), " +
                    "designation VARCHAR(50), " +
                    "aadhar VARCHAR(20), " +
                    "empId VARCHAR(10) PRIMARY KEY)";
            stmt.executeUpdate(createSql);

            // Close resources
            stmt.close();
            conn.close();

            System.out.println("Employee table created successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
