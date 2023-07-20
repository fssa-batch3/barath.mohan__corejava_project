package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task>{
	private int id;
	private String name;
	private LocalDate deadline;
  
  Task(int id,String name,String deadline){
	  this.id=id;
	  this.name=name;
	  LocalDate date = LocalDate.parse(deadline);
	  this.deadline=date;
	  
  }
  @Override
public int compareTo(Task t){

	 if(deadline==t.deadline) {
		 return 0;
	 }
	 else if(deadline.compareTo(t.deadline) > 0) {
		 return 1;
	 }
	 else {
		 return -1;
	 }
	 
  }
  
  public String toString(){
	  
	  String out = "Task id : "+this.id+" || Task name : "+this.name+" || Task DeadLine :"+deadline+"\n";
	  return out;
  }
}

public class SortingTask {
	 
	public static void main(String[] args) { 
		
		ArrayList<Task> taskArray= new ArrayList<Task>();
		taskArray.add(new Task(3,"Coding","2022-10-22"));
		taskArray.add(new Task(5,"Product Design","2022-10-01"));
		taskArray.add(new Task(1,"Software Design", "2022-10-07"));
		taskArray.add(new Task(3,"Coding","2022-10-22"));
		
		Collections.sort(taskArray);
		System.out.println(taskArray);
		
	}

}
