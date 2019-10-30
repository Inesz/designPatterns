package com.patterns.design.constructional.builder.ex1;

// Driver class
public class BuilderNeedDemo {
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
id = 1, name = null, address = Noida
id = 0, name = Ram, address = Noida
id = 0, name = null, address = null
id = 1, name = Ram, address = Noida
id = 0, name = null, address = Noida
 */