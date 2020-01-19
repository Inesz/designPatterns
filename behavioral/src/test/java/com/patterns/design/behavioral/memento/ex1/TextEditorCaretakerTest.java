package com.patterns.design.behavioral.memento.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TextEditorCaretakerTest {
    @Test
    public void shouldCaretakerWorkForNonEmptyData() {
        //given
        String testText = "[test]";
        String outputText = "[test][test]";
        TextEditorCaretaker tEditor = new TextEditorCaretaker(new TextWindowOriginator());
        //when
        tEditor.write(testText);
        tEditor.write(testText);
        System.out.println(tEditor.print());
        tEditor.save();
        tEditor.write(testText);
        System.out.println(tEditor.print());
        tEditor.undo();
        System.out.println(tEditor.print());
        String currentTextState = tEditor.print();
        //then
        assertTrue(currentTextState.equals(outputText));
    }
}