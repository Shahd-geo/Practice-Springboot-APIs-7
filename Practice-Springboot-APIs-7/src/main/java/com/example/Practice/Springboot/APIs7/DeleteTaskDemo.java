package com.example.Practice.Springboot.APIs7;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void deleteTask() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");
        System.out.println("Initial Task List:" + tasks);
        String targetTask = "Call doctor";
        //Search Logic (Core DELETE Process)
        for (String task : tasks) {
            if (task.equals(targetTask)) {
                tasks.remove(task);
                System.out.println("Task : " + task + " deleted successfully.");
                break;
            }
            //. Not Found Case .
            if (!task.equals(targetTask)) {
                System.out.println("Task not found. No deletion performed.");
            }
            //Display Final List
            System.out.println("Final Task List:");
            System.out.println(tasks);
        }
    }
    public static void main(String[] args){
        deleteTask();
    }
}
