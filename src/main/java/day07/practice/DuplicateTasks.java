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

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

}

public class DuplicateTasks {
	public static void main(String[] args) {



		List<Task> taskList = new ArrayList<Task>();

		taskList.add(new Task("Reading", 5,"2023-10-10"));
		taskList.add(new Task("Writing", 4,"2023-10-10"));
		taskList.add(new Task("Playing", 10,"2023-10-10"));
		taskList.add(new Task("Playing", 10,"2023-10-10"));
		
		HashSet<Task> hash= new HashSet<>(taskList);
		for(Task t:hash) {
			System.out.println(t.getName());
			
		}
	}
}
