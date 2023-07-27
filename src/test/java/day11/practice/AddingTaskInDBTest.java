package day11.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AddingTaskInDBTest {
	private Connection connection;

	@Before
	public void setUp() throws SQLException {
		// Set up a temporary test database before each test
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_tasks", "root", "123456");

		// Create the table in the temporary test database
		String createTableQuery = "CREATE TABLE task_details (task_id INT, task_name VARCHAR(255), status TINYINT)";
		try (Statement stmt = connection.createStatement()) {
			stmt.executeUpdate(createTableQuery);
		}
	}

	@After
	public void tearDown() throws SQLException {
		// Clean up the database after each test
		String dropTableQuery = "DROP TABLE IF EXISTS task_details";
		try (Statement stmt = connection.createStatement()) {
			stmt.executeUpdate(dropTableQuery);
		}
		if (connection != null) {
			connection.close();
		}
	}

	@Test
	public void testAddingTasksToDatabase() throws SQLException {
		Task task1 = new Task(100, "Reading", true);
		Task task2 = new Task(101, "Running", true);
		Task task3 = new Task(102, "Walking", true);

		ArrayList<Task> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);

		String query = "INSERT INTO task_details(task_id,task_name,status) VALUES" + "(?,?,?)";

		PreparedStatement psmt = connection.prepareStatement(query);
		for (Task t : tasks) {

			psmt.setString(1, t.id + "");
			psmt.setString(2, t.name);
			psmt.setString(3, t.status ? "1" : "0");

			int num = psmt.executeUpdate();

			System.out.println(num);
		}

		// Verify that the tasks are added to the database correctly
		int count = getCountFromDatabase(connection);
		assertEquals(tasks.size(), count);
	}

	// Helper method to get the count of rows in the task_details table
	private int getCountFromDatabase(Connection connection) throws SQLException {
		String countQuery = "SELECT COUNT(*) FROM task_details";
		try (Statement stmt = connection.createStatement(); ResultSet resultSet = stmt.executeQuery(countQuery)) {
			resultSet.next();
			return resultSet.getInt(1);
		}
	}
}
