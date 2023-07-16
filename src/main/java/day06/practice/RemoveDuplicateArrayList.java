package day06.practice;

import java.util.ArrayList;
import java.util.List;


public class RemoveDuplicateArrayList {
	
	
	 static List removeDuplicateCity(List cityList){
		List<String> newCityList = new ArrayList<String>();
		for(int i=0;i<cityList.size();i++) {
			int check=0;
			for(int j=0;j<newCityList.size();j++) {	
				if(cityList.get(i).equals(newCityList.get(j))) {
					check+=1;			
				}
			} 
			if(check<1) {
				newCityList.add((String) cityList.get(i));
			}
		}
		return newCityList; 
		 
	};
	
	static List createCityList(){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Bangalore");
		cityList.add("Bangalore"); 
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai"); 
		
		return cityList;
	}
	
public static void main(String[] args) {
	
	
	List<String> cityList= createCityList();
	List<String> newCityList = RemoveDuplicateArrayList.removeDuplicateCity(cityList);
	
	
	System.out.println(newCityList);
}
}
