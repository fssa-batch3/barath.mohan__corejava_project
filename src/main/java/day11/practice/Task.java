package day11.practice;

public class Task {
	
	public int id;
	public String name;
	public boolean status;
	
	public Task(int id,String name,boolean status){
		this.id=id;
		this.name=name;
		this.status=status;
	}
	
	public String toString(){
		String s= "Task Id :"+id+"Task name :"+name+"Task Status :"+status;
		return s;
	}
	
}