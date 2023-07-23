package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static Connection getConnection() {
		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/jdbc_demo1";
		String userName = "root";
		String password = "123456";
		
		try {
			con = DriverManager.getConnection(url,userName,password);
			System.out.println("Connection Successfull");
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		
		
		return con;
		
	}
	public static void main(String[] args) throws SQLException {
		Connection c= ConnectionDemo.getConnection();
		
		
		
		String query = "INSERT INTO students(student_name,email,dob) VALUES(\"Dharun\",\"dharun@gmail.com\",\"dob\")";
		Statement s= c.createStatement();
	
		int num =s.executeUpdate(query);
		
		System.out.println("rows affectted :"+num);
		
		String selectQuery = "SELECT * FROM students";
		
		ResultSet rs= s.executeQuery(selectQuery);
		
		int i=1; 
		while(rs.next()) {
			
			String name= rs.getString("student_name");
			
			System.out.println(i+name);
			i++;
		}
		
		rs.close();
		s.close();
		c.close();
		
		
	}
}
