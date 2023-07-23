package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.time.LocalDate;



public class MySqlConnection {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/jdbc_demo1"; // url for to connect local database

		String user = "root"; // user of local database

		String password = "123456"; // password of local database

//		Connection connection = DriverManager.getConnection(url, user, password); // creating connection
//
//		String query = "select * from  student"; // query
//
//		Statement statement = connection.createStatement(); // creating statement using Statement Interface, this will
//															// create statement
//
//		ResultSet resultSet = statement.executeQuery(query); // this will run the query and return the value

//		while (resultSet.next()) { // printing columns until there is no values
//
//			System.out.println("id: " + resultSet.getInt(1));
//			System.out.println("name: " + resultSet.getString(2));
//			System.out.println("email: " + resultSet.getString(3));
//			System.out.println("dob: " + resultSet.getDate(4));
//			System.out.println();
//
//		}

//		connection.close();

		insert(url, user, password, "denny", "denny1@gmail.com", LocalDate.of(2004, 02, 13));
		insert(url, user, password, "kingston", "king@gmail.com", LocalDate.of(2002, 06, 20));
//		String name = "denny";
//		String email = "denny@gmail.com";
//		LocalDate date = LocalDate.of(2023, 02, 13);
//		String query = "insert into student( name, email, dob) values ( '" + name + "','" + email + "','" + date
//				+ "');";
//		System.out.println(query);
	}

	public static void insert(String url, String user, String password, String name, String email, LocalDate date)
			throws SQLException {

		String query = "insert into students( student_name, email, dob) values ( '" + name + "','" + email + "','" + date+ "');";

		Connection connection = DriverManager.getConnection(url, user, password); // creating connection

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		System.out.println(preparedStatement.executeUpdate() + " rows updated");
		
		preparedStatement.close();

		connection.close();

	}

}