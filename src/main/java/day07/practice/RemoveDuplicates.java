package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(20);
		arr.add(30);
		arr.add(25);
		arr.add(30);
		arr.add(25);
		arr.add(30);
		arr.add(20);
		arr.add(35);
		
		HashSet<Integer> arr2= new HashSet<>(arr);
		
		for(Integer i:arr2){
			System.out.println("Elements are "+i);
		}

	}
}
