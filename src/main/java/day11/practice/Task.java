package day11.practice;

public class Task {
	
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

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