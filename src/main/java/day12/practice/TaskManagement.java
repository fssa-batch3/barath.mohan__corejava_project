package day12.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day11.practice.Task;

class TaskDAO {
	public void createTask(Task task) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks", "root", "123456");

			String query = "INSERT INTO task_details(task_id,task_name,status) VALUES(?,?,?)";
			PreparedStatement psmt = con.prepareStatement(query);

			psmt.setString(1, task.id + "");
			psmt.setString(2, task.name);
			psmt.setString(3, task.status ? 1 + "" : 0 + "");

			int num = psmt.executeUpdate();
			System.out.println("affected row/rows :" + num);

			psmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Creating task failed");
			
		}

	}

	public void updateTask(Task task) {

		try {
			int id=task.id;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks", "root", "123456");
			String query = "UPDATE task_details "
					+ "SET task_name =? "
					+ "WHERE task_id = ?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(2, task.id + "");
			psmt.setString(1, task.name);
			
			int num = psmt.executeUpdate();
			System.out.println("affected row/rows :" + num);
			psmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Updating task failed");

		}

	}

	public void deleteTask(int taskId)  {
	
	try {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks","root","123456");
		String query ="DELETE FROM task_details WHERE task_id= ? ";
		PreparedStatement psmt = con.prepareStatement(query);
		psmt.setString(1, taskId + "");
		int num = psmt.executeUpdate();
		System.out.println("affected row/rows :" + num);
		psmt.close();
		con.close();
		
	} catch (SQLException e) {
		System.out.println("Delete task failed");
	}
	
		
	}
//	
	public List<Task> getAllTasks()  {
		
	Connection con;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks","root","123456");
		
		
	String query ="SELECT * FROM task_details";
	
	Statement smt = con.createStatement();
	
	ResultSet rs= smt.executeQuery(query);
	
	ArrayList<Task> tasks= new ArrayList<Task>();

	
	while(rs.next()) {
//		System.out.println();
		tasks.add(new Task(Integer.parseInt(rs.getString("task_id")),rs.getString("task_name"),Integer.parseInt(rs.getString("status"))==1?true:false));
		System.out.println(rs.getString(1));
	} 

	
	return tasks;
	
	} catch (SQLException e) {
		System.out.println("Getting all list details failed");
	}
	return null;

	}

}

public class TaskManagement {

	public static void main(String[] args) {

		Task task1 = new Task(200, "Gym", true);
		Task task2 = new Task(201, "Jogging", true);
		Task task3 = new Task(201, "Sports", true);
		
		TaskDAO taskDAO = new TaskDAO();
		taskDAO.createTask(task1);
		taskDAO.createTask(task2);
		taskDAO.updateTask(task3);
		taskDAO.deleteTask(201);
		taskDAO.deleteTask(200);
		
		System.out.println(taskDAO.getAllTasks());
		
		

	}
}
