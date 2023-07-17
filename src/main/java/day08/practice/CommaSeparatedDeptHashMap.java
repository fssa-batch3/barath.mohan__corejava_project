package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CommaSeparatedDeptHashMap {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 3;
		int count=0;
		HashMap<String, ArrayList<String>> countMap = new HashMap<>();
		// Sample Inputs

		// HR,Ram
		// HR, Suresh
		// IT, Basker
		// IT, Joseph
		// Admin, Sundar
		while (count < num) {
			System.out.println("Enter at least " + num + " details:");
			String input = sc.nextLine();
			processInput(input, countMap);
			count++;
		} 

		printDepartmentDetails(countMap);
	}

	static void processInput(String input, HashMap<String, ArrayList<String>> countMap) {
		String[] ar = input.split(",");
		String department = ar[0].trim();
		String employee = ar[1].trim();

		if (countMap.containsKey(department)) {
			ArrayList<String> employees = countMap.get(department);
			employees.add(employee);
		} else {
			ArrayList<String> employees = new ArrayList<>();
			employees.add(employee);
			countMap.put(department, employees);
		}
	}

	static void printDepartmentDetails(HashMap<String, ArrayList<String>> countMap) {
		System.out.print("Departments: " + countMap.keySet()+"\n");
		for (String department : countMap.keySet()) {
			System.out.print(department + " : " + countMap.get(department)+"\n");
		}
	}
}
