package com.patterns.design.constructional.builder.ex3;

public class MainTest {

    public static void main(String[] args) {
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(task.toString());
    }

}

/*
output:
id = 5, summary = Test, description = Hello, done = false, dueDate = null
 */