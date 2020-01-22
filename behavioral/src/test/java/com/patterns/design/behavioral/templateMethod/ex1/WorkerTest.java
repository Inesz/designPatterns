package com.patterns.design.behavioral.templateMethod.ex1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * System.lineSeparator() is very important.
     * It takes actual separator for platform your java app is running on.
     * Avoids the problems with CR+LF line separator.
     */
    @Test
    public void shouldUseMethodForCook() {
        String expectedResult = "Put on your apron." + System.lineSeparator() +
                "Go for a cigarette." + System.lineSeparator() +
                "stopBreak" + System.lineSeparator() +
                "Go for a cigarette." + System.lineSeparator() +
                "stopBreak" + System.lineSeparator() +
                "Put your apron into the washing machine." + System.lineSeparator();

        Cook cook = new Cook();
        assertEquals(expectedResult, outContent.toString());

        String s = outContent.toString();
        System.setOut(originalOut);
        System.out.println(s);
    }

    @Test
    public void shouldUseMethodForProgrammer() {
        String expectedResult = "Turn on the computer." + System.lineSeparator() +
                "Make coffee." + System.lineSeparator() +
                "stopBreak" + System.lineSeparator() +
                "Make coffee." + System.lineSeparator() +
                "stopBreak" + System.lineSeparator() +
                "Turn off the computer." + System.lineSeparator();
        Programmer programmer = new Programmer();
        assertEquals(expectedResult, outContent.toString());

        String s = outContent.toString();
        System.setOut(originalOut);
        System.out.println(s);
    }
}