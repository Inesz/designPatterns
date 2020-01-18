package com.patterns.design.behavioral.iterator.ex1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    @Test
    void whenProfile_givenContactsArgNotEmpty_thenInitFriendContacts(){
        //given
        Profile profile = new Profile("Aga", "Jeden", "Dwa", "Trzy");
        //when
        List<String> contacts = profile.getContacts(ContactTypes.FRIEND.name());
        //then
        contacts.forEach(friend -> System.out.println(friend)); //just for fun
        assertTrue(contacts.size()==3);
    }

    @Test
    void whenProfile_givenContactsArgEmpty_thenFriendContactsSizeIs0(){
        //given
        Profile profile = new Profile("Aga");
        //when
        List<String> contacts = profile.getContacts(ContactTypes.FRIEND.name());
        //then
        contacts.forEach(friend -> System.out.println(friend)); //just for fun
        assertTrue(contacts.size()==0);
    }

}