package day05.practice;

class Department {
	String deptName;
	
	int deptId;
	public Department(String deptName, int deptId) {
		
		this.deptName = deptName;
		
		this.deptId = deptId;
		
	}
	public void printdepartmentDetails() {
		System.out.println("\ndepartment Name: " + this.deptName + " department Id :" + this.deptId);
	}
}
class Student {
	String name;
	int id;
	Department department;
	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	public void printDetails() {
		System.out.print("Student name is" + this.name + "\nStudent id is " + this.id );
		this.department.printdepartmentDetails();
	}
}
public class DepartmentDemo {
	public static void main(String[] args) {
		Department department = new Department("EEE", 1000);
		Student stu = new Student("Barath", 1000, department);
		stu.printDetails();
		Department department1 = new Department("CS", 1001);
		Student stu1 = new Student("Srikanan", 1001, department1);
		stu1.printDetails();
	}
}