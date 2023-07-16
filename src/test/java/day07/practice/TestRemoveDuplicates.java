package day07.practice;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class TestRemoveDuplicates {

    @Test
    public void testCreateListDemoWithDuplicates() {
        ArrayList<Integer> arr = RemoveDuplicates.createListDemo();

        // Ensure that the method correctly creates the list with duplicates
        assertEquals(8, arr.size());
    } 

    @Test
    public void testCreateListDemoWithoutDuplicates() {
        ArrayList<Integer> arr = RemoveDuplicates.createListDemo();

        // Ensure that the method removes duplicates and returns a list without duplicates
        ArrayList<Integer> arrWithoutDuplicates = new ArrayList<>(new HashSet<>(arr));
        assertEquals(4, arrWithoutDuplicates.size());
    }
    @Test
    public void testPrintElementsInTheArray() {
        // Set up System.out redirection to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
 
        TreeSet<Integer> arr2 = new TreeSet<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30); 

        // Call the method that prints the elements 
        RemoveDuplicates.printElementsInTheArray(arr2);

        // Get the printed output from System.out redirection
        String printedOutput = outputStream.toString();

        // Ensure that the printed output matches the expected output
        assertEquals("Elements are 10\nElements are 20\nElements are 30\n", printedOutput);
    }



}
