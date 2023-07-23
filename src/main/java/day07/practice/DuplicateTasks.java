package day07.practice;


import java.time.LocalDate;
//import java.time.LocalDate;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;
 
	Task(String name, int id,String date) {

		this.name = name;
		this.id = id;
        
        LocalDate localDate = LocalDate.parse(date);
        this.deadline = localDate;
	}
 
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
 

	public LocalDate getDeadline() {
		return deadline;
	}

	public int hashCode() {
	    return this.getId(); 
	}
 
	public boolean equals(Object obj) { 
		Task e = null;
	    if(obj instanceof Task){
	        e = (Task) obj;
	    }
	    
	    if(this.getId() == e.getId()){ 
	        return true;
	    } else { 
	        return false;
	    }  
	}
}


public class DuplicateTasks {
	
	
	public static HashSet createTask() {


		HashSet<Task> taskList = new HashSet<Task>();

		taskList.add(new Task("Reading", 5,"2023-10-10"));
		taskList.add(new Task("Writing", 4,"2023-10-10")); 
		taskList.add(new Task("Playing", 10,"2023-10-10"));
		taskList.add(new Task("Playing", 10,"2023-10-10"));
		return taskList;
		
	}
	public static void main(String[] args) {


		HashSet<Task> taskList = createTask();

		for(Task t:taskList) {
			System.out.println(t.getName());
			
		}
	}
}
