package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class CommaSeparatedHashMap {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();//Ram,Ram,Superman,Spider,hey,hello,hey,Spider
	String[] ar = s.split(",");
	HashMap<String, Integer> countMap= new HashMap<String, Integer>();
	for(int i=0;i<ar.length;i++) {
		if(countMap.get(ar[i])==null) {	
			countMap.put(ar[i],1);
	
		}
		else {
			int count=countMap.get(ar[i]);
			countMap.put(ar[i],count+1);
	
		}
		
	}

	for(String n:countMap.keySet()) {
		System.out.println(n+" : "+countMap.get(n));
	
		
	}
}
}
