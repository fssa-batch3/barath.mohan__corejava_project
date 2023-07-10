package day03.practice;



public class User {
	private String name;
	private String emailid;
	private String password;
	
	User(){
		System.out.println("User account is created successfully!");
	}
	User(String name,String emailid,String password){
		this.name=name;
		this.emailid=emailid;
		this.password=password;
		System.out.println("User account is created successfully!");
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {
		
		
		User user1 = new User();
		user1.setName("dhilip");
		user1.setEmailid("dhilip@gmail.com");
		user1.setPassword("12345@dhilip");
		
		System.out.println(user1.getEmailid());
		System.out.println(user1.getName());
		System.out.println(user1.getPassword());
		
		
		User user2 = new User("Barath","Barath@gmail.com","12345@barath");
		System.out.println(user2.getEmailid());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		
		
	}
}
