package day02.practise;

class User {

	int id;
	String name;
	String password;
	String emailId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


}

public class UserDemo{
	public static void main(String[] args) {
		User user = new User();
		user.setId(2);
		user.setName("Barath");
		user.setPassword("Barath@123");
		user.setEmailId("barath@freshworks.com");
		System.out.println(user.getId());
		System.out.println(user.getEmailId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		
	}
	
}
