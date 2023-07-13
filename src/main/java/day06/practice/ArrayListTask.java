package day06.practice;

import java.util.ArrayList;
import java.util.List;

class Task {
	 
    public String taskName;
     
    public int priority;
    
    Task(String taskName,int priority ){
    	this.taskName=taskName;
    	this.priority=priority;
    	
    }
     
     
}
public class ArrayListTask {

	
	public static void main(String[] args) {
		
		List<Task> taskList = new ArrayList<Task>();
		
		taskList.add(new Task("Reading", 5));
		taskList.add(new Task("Writing", 4));
		taskList.add(new Task("Playing", 10));
		taskList.add(new Task("Gaming", 10));
	}
}
