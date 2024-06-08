package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    public Connection conn;
    public Statement s;

    public Conn() {
        try {
            Class.forName("org.h2.Driver");
            this.conn = DriverManager.getConnection("jdbc:h2:~/employeemanagementsystem", "sa", "");
            this.s = this.conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
