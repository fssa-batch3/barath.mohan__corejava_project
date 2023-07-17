package day08.practice;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCommaSeparatedDeptHashMap {
    private HashMap<String, ArrayList<String>> countMap;

    @Test
    public void testProcessInput_AddNewDepartment() {
    	countMap = new HashMap<>();
        String input = "HR,John";

        CommaSeparatedDeptHashMap.processInput(input, countMap);

        Assertions.assertEquals(1, countMap.size());
        Assertions.assertTrue(countMap.containsKey("HR"));
        Assertions.assertEquals(1, countMap.get("HR").size());
        Assertions.assertTrue(countMap.get("HR").contains("John"));
    }

    @Test
    public void testProcessInput_AddToExistingDepartment() {
    	 countMap = new HashMap<>();
        countMap.put("IT", new ArrayList<>());
        countMap.get("IT").add("Alice");
        String input = "IT,Bob";

        CommaSeparatedDeptHashMap.processInput(input, countMap);

        Assertions.assertEquals(1, countMap.size());
        Assertions.assertTrue(countMap.containsKey("IT"));
        Assertions.assertEquals(2, countMap.get("IT").size());
        Assertions.assertTrue(countMap.get("IT").contains("Alice"));
        Assertions.assertTrue(countMap.get("IT").contains("Bob"));
    }

    @Test
    public void testPrintDepartmentDetails() {
    	countMap = new HashMap<>();
    
        countMap.put("HR", new ArrayList<>());
        countMap.get("HR").add("John");
        countMap.put("IT", new ArrayList<>());
        countMap.get("IT").add("Alice");
        countMap.get("IT").add("Bob");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        CommaSeparatedDeptHashMap.printDepartmentDetails(countMap);
        
        String printedOutput = outputStream.toString().trim();
        
        String expectedOutput = "Departments: [HR, IT]\n" +
                "HR : [John]\n" + 
                "IT : [Alice, Bob]";

        Assertions.assertEquals(expectedOutput,printedOutput);
    }


}
