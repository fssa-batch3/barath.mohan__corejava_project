package day11.practice;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TaskDAOTest {

    private Connection connection;

    @Before
    public void setUp() throws SQLException {
    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks", "root", "123456");
        createTable();
    }

    @After
    public void tearDown() throws SQLException {
        connection.close();
    }

    @Test
    public void testInsertTasks() throws SQLException {
        TaskDAO taskDAO = new TaskDAO(connection);

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(100, "Reading", true));
        tasks.add(new Task(101, "Running", true));
        tasks.add(new Task(102, "Walking", true));

        taskDAO.insertTasks(tasks);
        
        try (Statement stmt = connection.createStatement();
                ResultSet resultSet = stmt.executeQuery("SELECT * FROM task_details ORDER BY task_id")) {

               assertTrue(resultSet.next());
               assertEquals(100, resultSet.getInt("task_id"));
               assertEquals("Reading", resultSet.getString("task_name"));
               assertTrue(resultSet.getBoolean("status"));

               assertTrue(resultSet.next());
               assertEquals(101, resultSet.getInt("task_id"));
               assertEquals("Running", resultSet.getString("task_name"));
               assertTrue(resultSet.getBoolean("status"));

               assertTrue(resultSet.next());
               assertEquals(102, resultSet.getInt("task_id"));
               assertEquals("Walking", resultSet.getString("task_name"));
               assertTrue(resultSet.getBoolean("status"));

               assertFalse(resultSet.next()); // Ensure no more rows in the result set
           }

        // Add your assertions here to check if the tasks are correctly inserted into the database.
        // You can query the database to verify the inserted values.
    }

    private void createTable() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("CREATE TABLE task_details (task_id INT PRIMARY KEY, task_name VARCHAR(255), status BOOLEAN)");
        }
    }
}
