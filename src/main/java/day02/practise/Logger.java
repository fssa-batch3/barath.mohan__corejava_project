package day02.practise;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg+ " It is a string debug message");
	}
	public static void debug (int num) {
		System.out.println("DEBUG: " + num+ " It is a int debug message");
	}
	
	public static void info (String msg) {
		System.out.println("INFO: " + msg+ " It is a string info message");
	}
	public static void info (int msg) {
		System.out.println("INFO: " + msg+ " It is a int info message");
	}
	
	public static void error (String msg) {
		System.out.println("ERROR: " + msg+ " It is a string error message");
	}
	public static void error (int msg) {
		System.out.println("ERROR: " + msg+ " It is a int error message");
	}
}