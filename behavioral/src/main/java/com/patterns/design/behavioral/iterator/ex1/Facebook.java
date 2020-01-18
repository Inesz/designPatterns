package com.patterns.design.behavioral.iterator.ex1;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String name) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + name + "' over the network...");
        return findProfile(name);
    }

    public List<String> requestProfileFriendsFromFacebook(String name) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + ContactTypes.FRIEND.name() + "' list of '" + name + "' over the network...");

        Profile profile = findProfile(name);
        if (profile != null) {
            return profile.getContacts(ContactTypes.FRIEND.name());
        }
        return null;
    }

    private Profile findProfile(String name) {
        for (Profile profile : profiles) {
            if (profile.getName().equals(name)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String name) {
        return new FacebookIterator(this, ContactTypes.FRIEND.name(), name);
    }

}
