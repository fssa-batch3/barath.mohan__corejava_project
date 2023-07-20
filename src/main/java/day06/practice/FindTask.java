package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTask {

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (int i = 0; i < tasks.size(); i++) {
			if (name.equals(tasks.get(i).name)) {
				return true;
			}

		}
		return false;

	}

	public static ArrayList createTaskList() {
		ArrayList<Task> taskList = new ArrayList<Task>();

		taskList.add(new Task("Reading", 5));
		taskList.add(new Task("Writing", 4));
		taskList.add(new Task("Playing", 10));
		taskList.add(new Task("Gaming", 10));
		
		return taskList;

	} 

	public static void main(String[] args) {

		ArrayList<Task> taskList= createTaskList();
		System.out.println(findTaskByName("Gaming", taskList));

		System.out.println(findTaskByName("Jogging", taskList));
	}
}
