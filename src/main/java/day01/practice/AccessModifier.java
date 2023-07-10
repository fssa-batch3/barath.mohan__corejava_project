package day01.practice;


public class AccessModifier {
	private String a = "a";
	private String b = "b";
	private String c = "c";
	private static String d = "d";
	
	
	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	public static String getD() {
		return d;
	}


	public static void setD(String d) {
		AccessModifier.d = d;
	}


	public static void main(String[] args) {
		AccessModifier accessModifier =new AccessModifier();
		System.out.println(accessModifier.getA());
		System.out.println(accessModifier.getB());
		System.out.println(accessModifier.getC());
		System.out.println(accessModifier.getD());		
	}
}