package day07.practice;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestDuplicateTasks {

    @Test
    public void testCreateTaskWithUniqueTasks() {
        Set<Task> taskList = DuplicateTasks.createTask();

        // Ensure that the method correctly creates a set of unique tasks
        assertEquals(3, taskList.size());
    }

    @Test
    public void testCreateTaskWithDuplicateTasks() {
        Set<Task> taskList = DuplicateTasks.createTask();
        for (Task task : taskList) {
            if((task.getName()).equals("Playing")) {
            	
            	taskList.remove(task);
            	break;
            };
        }
       

        // Ensure that the method does not allow duplicates and removes them
        // In this case, the two "Playing" tasks with the same ID should be considered duplicates and removed
        assertEquals(2, taskList.size());

        for (Task task : taskList) {
            assertNotEquals("Playing", task.getName());
        }
    }



    @Test
    public void testCreateTaskWithDifferentDates() {
        // Test the case when tasks with different dates are added to the task list
        Set<Task> taskList = DuplicateTasks.createTask();
        taskList.add(new Task("Coding", 15, "2023-11-11"));
        assertEquals(4, taskList.size());
    }


}
