package com.patterns.design.behavioral.iterator.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String name;
    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String name, String... contacts) {
        this.name = name;
        setContacts(contacts);
    }

    private void setContacts(String... contacts) {
        String contactType = ContactTypes.FRIEND.name();
        this.contacts.put(contactType, new ArrayList<>(List.of(contacts)));
    }

    public String getName() {
        return name;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }
}
