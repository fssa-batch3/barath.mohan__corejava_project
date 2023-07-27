package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;



public class AddingTaskInDB {
	
	public static void main(String[] args) throws SQLException { 
		
		Task task1= new Task(100,"Reading",true);
		Task task2= new Task(101,"Running",true);
		Task task3= new Task(102,"Walking",true);
		
		ArrayList<Task> tasks= new ArrayList<Task>(); 
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		//jdbc:mysql://localhost:3306/jdbc_demo1
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks","root","123456");
		
		String query="INSERT INTO task_details(task_id,task_name,status) VALUES"
				+ "(?,?,?)";
		
		PreparedStatement psmt= con.prepareStatement(query);
		
		for(Task t:tasks) {
			
			psmt.setString(1,t.id+""); 
			psmt.setString(2,t.name);
			psmt.setString(3, t.status?"1":"0");
			
			int num = psmt.executeUpdate();
			
			System.out.println(num);
		}
		
		
		
	}
}
