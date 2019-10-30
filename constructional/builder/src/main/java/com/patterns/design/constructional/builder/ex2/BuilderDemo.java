package com.patterns.design.constructional.builder.ex2;

import com.patterns.design.constructional.builder.ex2.StudentReceiver;

// Driver class
public class BuilderDemo {
    public static void main(String args[])
    {
        for(int i = 0; i < 100; i++) {
            StudentReceiver sr = new StudentReceiver();
            System.out.println(sr.getStudent());
        }
    }
}

/*
output:
null
id = 1, name = Ram, address = Noida
null
 */