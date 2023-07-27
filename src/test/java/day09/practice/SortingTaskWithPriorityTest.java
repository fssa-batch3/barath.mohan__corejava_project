package day09.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class SortingTaskWithPriorityTest {

    @Test
    public void testTaskSorting() {
    	
    	ArrayList<Task1> taskArray= new ArrayList<Task1>();
    	 taskArray.add(new Task1(3, "Coding", "2022-10-22", 5));
         taskArray.add(new Task1(3, "Coding", "2022-10-22", 4));
         taskArray.add(new Task1(5, "Product Design", "2022-10-01", 6));
         taskArray.add(new Task1(1, "Software Design", "2022-10-07", 7));
         taskArray.add(new Task1(3, "Coding", "2022-10-22", 3));
         
        Collections.sort(taskArray); 
 
        ArrayList<Task1> expected = new ArrayList<>(Arrays.asList(
            new Task1(5, "Product Design", "2022-10-01", 6), 
            new Task1(1, "Software Design", "2022-10-07", 7),
            new Task1(3, "Coding", "2022-10-22", 3),
            new Task1(3, "Coding", "2022-10-22", 4),
            new Task1(3, "Coding", "2022-10-22", 5)
        ));

        assertEquals(expected.toString(), taskArray.toString()); 
    } 

    @Test
    public void testTaskEquality() {
        Task1 task1 = new Task1(1, "Software Design", "2022-10-07", 7);
        Task1 task2 = new Task1(1, "Software Design", "2022-10-07", 7);

        assertEquals(task1.toString(), task2.toString());
    }

    @Test
    public void testTaskComparison() {
    	
        Task1 task1 = new Task1(1, "Software Design", "2022-10-07", 7);
        Task1 task2 = new Task1(3, "Coding", "2022-10-22", 5);

        assertTrue(task1.compareTo(task2) < 0);
    }
}
