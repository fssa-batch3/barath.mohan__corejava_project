package day10.misc;

public class DivideDemo {
public static void main(String[] args) {
	int a=10;
	int b=10;
	System.out.println(divide(a,b));
	
}
public static int divide(int a, int b) throws IllegalArgumentException {
	
	if(b==0) {
		throw new IllegalArgumentException("The diviser should not be equal to Zero	");
		
	}
	return a/b;
}
}
