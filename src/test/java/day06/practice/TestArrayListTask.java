package day06.practice;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import day06.practice.ArrayListTask;
import day06.practice.Task;



public class TestArrayListTask {

    @Test
    public void testTaskListSize() {
        List<Task> taskList = ArrayListTask.createTaskList();

        // Ensure that the taskList contains the correct number of elements
        assertEquals(4, taskList.size());
    }

    @Test
    public void testTaskListContents() {
        List<Task> taskList = ArrayListTask.createTaskList();

        // Ensure that the taskList contains the expected tasks with the correct priorities
        assertEquals("Reading", taskList.get(0).name);
        assertEquals(5, taskList.get(0).priority);

        assertEquals("Writing", taskList.get(1).name);
        assertEquals(4, taskList.get(1).priority);

        assertEquals("Playing", taskList.get(2).name);
        assertEquals(10, taskList.get(2).priority);

        assertEquals("Gaming", taskList.get(3).name);
        assertEquals(10, taskList.get(3).priority);
    }

}
