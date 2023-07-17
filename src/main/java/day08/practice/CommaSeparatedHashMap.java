package day08.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class CommaSeparatedHashMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the names:");
        String s = sc.nextLine(); //Ram,Ram,Superman,Spider,hey,hello,hey,Spider
        String[] ar = s.split(",");
        TreeMap<String, Integer> countMap = createCountMap(ar);
        printCountMap(countMap);
    }

    public static TreeMap<String, Integer> createCountMap(String[] arr) {
        TreeMap<String, Integer> countMap = new TreeMap<>();

        for (String item : arr) {
            if (countMap.get(item) == null) {
                countMap.put(item, 1);
            } else {
                int count = countMap.get(item);
                countMap.put(item, count + 1);
            }
        }

        return countMap;
    }

    public static void printCountMap(TreeMap<String, Integer> countMap) {
        for (String item : countMap.keySet()) {
            System.out.print(item + " : " + countMap.get(item)+"\n");
        }
    }
}
