package day11.solved;

import java.sql.*;
public class TestMySqlDatabase {
public static void main(String[] args) throws SQLException {
	
	String url = "jdbc:mysql://localhost:3306/fssa";
	String userName = "root";
	String password = "123456"; 
	
	Connection con = DriverManager.getConnection(url, userName, password);
	
	System.out.println("Connection created.");
    con.close();
}
}