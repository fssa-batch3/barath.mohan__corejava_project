package day10.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {

	public InvalidEmailException(String msg) {
		super(msg); 
	}
	public InvalidEmailException(Throwable te) {
		super(te);
	}
	public InvalidEmailException(String msg, Throwable te) {
		
		super(msg, te);
		System.out.println("tyuygf");
	}
}  

class EmailValidator {
	public static boolean validEmail(String emailId) throws InvalidEmailException {
		if (emailId == null) {
			throw new InvalidEmailException("The email cannot be null");
		}
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		
		Boolean isMatch = Pattern.matches(regex, emailId);
		if (!isMatch) {
			
			throw new InvalidEmailException("The email is invalid");
		}
		return true;
	}
}
public class EmailExceptionDemo {
	
	public static void main(String[] args) throws InvalidEmailException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your email");
		
		String email = scan.nextLine();
		try {
			
			EmailValidator.validEmail(email);
			 
		} catch (InvalidEmailException e) {
			e.printStackTrace();
			
		}
	}
}









