package day06.practice;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTask {

    public static List<Task> createTaskList() {
        List<Task> taskList = new ArrayList<Task>();
        taskList.add(new Task("Reading", 5));
        taskList.add(new Task("Writing", 4));
        taskList.add(new Task("Playing", 10));
        taskList.add(new Task("Gaming", 10));
        return taskList;
    } 
    // Other methods in the ArrayListTask class, if any...
}