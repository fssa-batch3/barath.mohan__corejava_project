package day06.practice;

public class Task {
	 
    public String name;
     
    public int priority;
    
    public Task(){
    	
    }
    Task(String name,int priority){
    	this.name= name;
    	this.priority= priority;
    	
    }
    
	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
     
     
}