package day07.practice;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;



public class RemoveDuplicates {
	
	public static ArrayList createListDemo() {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(20);
		arr.add(30);
		arr.add(25); 
		arr.add(30);
		arr.add(25);
		arr.add(30);
		arr.add(20);
		arr.add(35);
		return arr;
		
		} 
	
	
	public static void printElementsInTheArray(TreeSet<Integer> arr2) {
		for(Integer i:arr2){
			System.out.print("Elements are "+i+"\n");
			
			  
		}
//		System.out.print("Elements are 10\nElements are 20\nElements are 30\n");
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr= createListDemo();
		TreeSet<Integer> arr2= new TreeSet<>(arr);
		
		printElementsInTheArray(arr2);
	



	}
}
