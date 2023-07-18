package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedList {
	
	public static ArrayList<Integer> getInputValues(int num){
		
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter "+num+" values :");
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		while(count<num) {
			
			int value= sc.nextInt();
			arr.add(value);
			count++;
		}
		
		return arr;
		
	}
	
public static void main(String[] args) {
	
	ArrayList<Integer> arr= SortedList.getInputValues(5);
	System.out.println("Before Sorting :"+arr);
	Collections.sort(arr);
	System.out.println("After Sorting :"+arr);
}
}
