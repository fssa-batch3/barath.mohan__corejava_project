package day09.practice;



import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedListTest {

    @Test 
    public void testGetInputValues() {
        // Test case for getInputValues method
        ArrayList<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(3); 
        input.add(7);
        input.add(1);
        input.add(2);
        
        ArrayList<Integer> result = SortedList.getInputValues(5);
        Assertions.assertEquals(input, result);
    }

}
