package com.patterns.design.constructional.builder.ex1;

// Client Side Code
public class StudentReceiver {
    private final Student student = new Student();

    public StudentReceiver()
    {

        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                student.setId(1).setName("Ram").setAddress("Noida");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                student.setId(2).setName("Shyam").setAddress("Delhi");
            }
        });

        t1.start();
        t2.start();
    }

    public Student getStudent()
    {
        return student;
    }
}