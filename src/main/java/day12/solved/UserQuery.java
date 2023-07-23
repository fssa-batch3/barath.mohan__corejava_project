package day12.solved;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement; 

import day11.solved.ConnectionUtil;

public class UserQuery {

	public static void main(String[] args) throws Exception {

		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

		Statement stmt = connection.createStatement();

		// Step 03: Execute Insert Query
		String query = "INSERT INTO students (student_name, email, dob) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\", \"10-10-2000\")";
		int rows = stmt.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		// Step 04: Execute SELECT Query
		final String selectQuery = "SELECT student_name,email,dob FROM students";

		// Step 05: Get the resultset
		ResultSet rs = stmt.executeQuery(selectQuery);

		// Step 06: Iterate the result
		while (rs.next()) {
			String userName = rs.getString("student_name");
			String userEmail = rs.getString("email");
			String dob = rs.getString("dob");

			System.out.println("Student_name:" + userName + ", email:" + userEmail + ",  DOB:" + dob);
		}

		// Step 07: close the connection resources
		rs.close();
		stmt.close();
		connection.close();

	}

}