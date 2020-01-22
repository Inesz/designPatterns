package com.patterns.design.behavioral.state.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class LiveTest {

    @Test
    public void whenLive_givenEntireProcess_thenEatWorkSleep() {
        Live live = new Live();

        live.prev(); //This is the first state.
        assertTrue("Eat".equalsIgnoreCase(live.showState()));
        live.next();
        assertTrue("Work".equalsIgnoreCase(live.showState()));
        live.next();
        assertTrue("Sleep".equalsIgnoreCase(live.showState()));
        live.prev();
        assertTrue("Work".equalsIgnoreCase(live.showState()));
        live.next();
        assertTrue("Sleep".equalsIgnoreCase(live.showState()));
        live.next(); //last state
    }

    @Test
    public void givenLivePattern_whenLiveNext_thenStateWork() {
        //given
        Live live = new Live();
        //when
        live.next();
        //then
        assertTrue(live.state instanceof Work);
    }

    @Test
    public void shouldInstanceofReturnFalse(){
        Live live = null;
        assertFalse(live instanceof Live);
    }
}