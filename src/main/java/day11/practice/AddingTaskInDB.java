package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddingTaskInDB {

	public static void main(String[] args) throws SQLException {
		Task task1 = new Task(100, "Reading", true);
		Task task2 = new Task(101, "Running", true);
		Task task3 = new Task(102, "Walking", true);

		List<Task> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks", "root", "123456")) {
			TaskDAO taskDAO = new TaskDAO(con);
			taskDAO.insertTasks(tasks);
		}

	}
}
