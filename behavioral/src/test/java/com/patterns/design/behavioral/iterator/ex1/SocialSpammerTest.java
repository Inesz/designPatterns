package com.patterns.design.behavioral.iterator.ex1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SocialSpammerTest {
    List<Profile> data = new ArrayList<Profile>();

    @BeforeEach
    public void createTestProfiles() {
        data.add(new Profile("anna", "mad_max", "bill"));
        data.add(new Profile("mad_max", "anna", "bill"));
        data.add(new Profile("bill", "anna"));

        data.add(new Profile("error", "errorsFriend"));
    }

    @Test
    public void whenSocialSpammerRun_givenProfile_thenSpamIsSendToFriends() {
        //given
        SocialNetwork network = new Facebook(data);
        SocialSpammer spammer = new SocialSpammer(network);
        //when, then
        spammer.sendSpamToFriends("anna",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
    }

    @Test
    public void whenSocialSpammerRun_givenProfileWithFakeFriend_thenExceptionThrown() {
        //given
        SocialNetwork network = new Facebook(data);
        SocialSpammer spammer = new SocialSpammer(network);
        Exception expectedException = new NullPointerException();

        //when
        Exception exception = assertThrows(Exception.class, () -> {
            spammer.sendSpamToFriends("error", "Ups, will not be spamming");
        });

        //then
        System.out.println(expectedException.toString());
        assertTrue(exception.toString().contains(expectedException.toString()));

        /*//it could be easier, just:
        assertThrows(Exception.class, () -> {
            spammer.sendSpamToFriends("error", "Ups, will not be spamming");
        });*/
    }
}