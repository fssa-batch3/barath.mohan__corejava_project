package day06.practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import day06.practice.FindTask;
import day06.practice.Task;

public class TestFindTask {

    @Test
    public void testFindTaskByNameExistingTask() {
        ArrayList<Task> taskList = FindTask.createTaskList();

        boolean result = FindTask.findTaskByName("Gaming", taskList);

        // Ensure that the method correctly finds the existing task
        assertTrue(result);
    }

    @Test
    public void testFindTaskByNameNonExistingTask() {
    	ArrayList<Task> taskList = FindTask.createTaskList();

        boolean result = FindTask.findTaskByName("Jogging", taskList);

        // Ensure that the method correctly returns false for a non-existing task
        assertFalse(result);
    }

    @Test
    public void testFindTaskByNameEmptyTaskList() {
        ArrayList<Task> taskList = new ArrayList<Task>(); 

        boolean result = FindTask.findTaskByName("Reading", taskList);

        // Ensure that the method correctly returns false for an empty task list
        assertFalse(result);
    }

}
