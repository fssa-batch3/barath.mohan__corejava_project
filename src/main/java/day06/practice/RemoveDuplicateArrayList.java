package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArrayList {
public static void main(String[] args) {
	List<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Mumbai");
	cityList.add("Bangalore");
	cityList.add("Bangalore");
	cityList.add("Bangalore");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");
	
	List<String> newCityList = new ArrayList<String>();
	
	for(int i=0;i<cityList.size();i++) {
		int check=0;
		for(int j=0;j<newCityList.size();j++) {	
			if(cityList.get(i).equals(newCityList.get(j))) {
				check+=1;			
			}
		}
		if(check<1) {
			newCityList.add(cityList.get(i));
		}
	}
	System.out.println(newCityList);
}
}
