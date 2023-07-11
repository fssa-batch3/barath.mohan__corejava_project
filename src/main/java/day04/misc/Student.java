package day04.misc;

public class Student extends Person {
	
	float marks;
	
	public Student(int age, String name, float marks) {
		super(age, name);
		this.marks = marks;
		this.age = 10;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Marks: " + this.marks);
		
	}
	public static void main(String[] args) {
		Person s1 = new Student(15, "Ram", 90.5f);
		s1.printDetails();
	}
	
}