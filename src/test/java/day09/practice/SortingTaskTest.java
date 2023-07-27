package day09.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class SortingTaskTest {

    @Test
    public void testSortingTasks() {
    	
        ArrayList<Task> taskArray = new ArrayList<>();
        taskArray.add(new Task(3, "Coding", "2022-10-22"));
        taskArray.add(new Task(5, "Product Design", "2022-10-01"));
        taskArray.add(new Task(1, "Software Design", "2022-10-07"));
        taskArray.add(new Task(3, "Coding", "2022-10-22")); 

        ArrayList<Task> sortedArray = new ArrayList<>();
        sortedArray.add(new Task(5, "Product Design", "2022-10-01"));
        sortedArray.add(new Task(1, "Software Design", "2022-10-07"));
        sortedArray.add(new Task(3, "Coding", "2022-10-22"));
        sortedArray.add(new Task(3, "Coding", "2022-10-22"));

        Collections.sort(taskArray);
//        System.out.println(sortedArray);
        assertEquals(sortedArray.toString(), taskArray.toString()); 
    }
}

