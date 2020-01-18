package com.patterns.design.behavioral.iterator.ex1;

public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileName, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = network.createFriendsIterator(profileName);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getName(), message);
        }
    }

    public void sendMessage(String name, String message) {
        System.out.println("Sent message to: '" + name + "'. Message body: '" + message + "'");
    }
}