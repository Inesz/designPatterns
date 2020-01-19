package com.patterns.design.behavioral.methodPattern.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.MessageFormat;

@Setter
@Getter
@AllArgsConstructor
public class Computer {
    private String processor;
    private String motherboard;
    private String motherboard_setup;

    @Override
    public String toString(){
        return MessageFormat.format("{0} {1} {2}", processor, motherboard, motherboard_setup);
        //return String.format("{0} {1} {2}", processor, motherboard, motherboard_setup);
    }
}
