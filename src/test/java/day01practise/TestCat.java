package day01practise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day01.practice.Cat;


public class TestCat {

	@Test
	public void testInvalidAge() {
		
		int age =0;
		String expectedMessage="Age should be gretaer than 0";
		try {
			
		}catch(IllegalArgumentException e) {
			Assertions.assertEquals(expectedMessage,e.getMessage());
			
		}
	}
	
	
	
	
}
