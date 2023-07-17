package day08.misc;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	String[] ar= {"barath","madhu","steffy","balaji","kingston","steffy"};
	
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
	System.out.println(countMap);
}}
