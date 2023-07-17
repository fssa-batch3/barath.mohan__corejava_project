package day08.misc;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class ContinousEvenCount {
	public static void main(String[] args) {

		String s = "aaabbaccccddddeee";
		int count = 0;
		int add = 0;
		char c = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {

			if (c == s.charAt(i)) {
				count++;
			} else if (count % 2 == 0) {
				add += count;
				c = s.charAt(i);
				count = 1;

			} else {
				c = s.charAt(i);
				count = 1;

			}
			if ((i + 1) == s.length()) {

				if (count % 2 == 0) {
					add += count;
				}
			}

		}
		System.out.println(add);
	}
}