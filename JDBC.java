package employee.management.system;

import java.sql.*;

public class JDBC {
    
    Connection c;
    Statement s;

    public JDBC () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///emp_system", "root", "8111000241_jenisha");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public static void main(String[] args) {
        new JDBC();
    }
}