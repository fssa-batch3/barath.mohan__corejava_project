package day10.practice;

import java.util.ArrayList;
class UserAlreadyExistsException extends RuntimeException {
	private static final long serialVersionUID = -8105491977357554060L;
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}
	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}
	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}
class User {
	int id;
	String name;
	String emailId;
	public User(int id, String name, String emailId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
class UserValidator {
	
	static ArrayList<User> arr = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException {
		
		if (user == null) {
			throw new UserAlreadyExistsException("User Object Cannot be Null");
		}
		for (User element : arr) {
			if (element.emailId.equals(user.getEmailId())) {
				throw new UserAlreadyExistsException("User already added");
			}
		}
		arr.add(user);
		System.out.println(arr);
		System.out.println("User added");
		return true;
	}
}
public class UserAlreadyExistsExceptions {
	public static void main(String[] args) {
		User user1 = new User(1, "b2hack", "b2hack@gmailq.com");
		User user2 = new User(1, "b2hack", "b2hack@gmai.com");
		UserValidator.register(user1);
		UserValidator.register(user2);
		UserValidator.register(user1);
	}
}