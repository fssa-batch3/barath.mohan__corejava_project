package day08.practice;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.TreeMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCommaSeparatedHashMap {

    @Test
    public void testCreateCountMap() { 
        String[] inputArray = {"Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider"};
       TreeMap<String, Integer> countMap = CommaSeparatedHashMap.createCountMap(inputArray);

        // Expected output: {"Ram": 2, "Superman": 1, "Spider": 2, "hey": 2, "hello": 1}
        Assertions.assertEquals(2, countMap.get("Ram"));
        Assertions.assertEquals(1, countMap.get("Superman"));
        Assertions.assertEquals(2, countMap.get("Spider"));
        Assertions.assertEquals(2, countMap.get("hey"));
        Assertions.assertEquals(1, countMap.get("hello"));
        Assertions.assertNull(countMap.get("NonExistingItem"));
    }

    @Test 
    public void testPrintCountMap() {
        TreeMap<String, Integer> countMap = new TreeMap<>();
        countMap.put("Apple", 3);
        countMap.put("Banana", 2);
        countMap.put("Orange", 1);

        String expectedOutput = "Apple : 3\n" +
                "Banana : 2\n" +
                "Orange : 1\n";
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CommaSeparatedHashMap.printCountMap(countMap);
        
        
        Assertions.assertEquals(expectedOutput, outContent.toString());
    }

}
