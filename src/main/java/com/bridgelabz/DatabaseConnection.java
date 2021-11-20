package com.bridgelabz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
public static Connection getConnection() throws SQLException {
    String jdbcURL = "jdbc:mysql://localhost:3306/payroll_services?useSSL=false";
    String userName = "root";
    String password = "1234";
    Connection connection;
    System.out.println("Connecting to database: "+jdbcURL);
    connection = DriverManager.getConnection(jdbcURL, userName, password);
    System.out.println("Connection is successful! " +connection);
    return connection;
}

}
