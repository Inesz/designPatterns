package com.patterns.design.behavioral.iterator.ex1;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String name;
    private int currentPosition = 0;
    private List<String> names = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String name) {
        this.facebook = facebook;
        this.type = type;
        this.name = name;
    }

    private void lazyLoad() {
        if (names.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.name);
            for (String profile : profiles) {
                this.names.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < names.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendName = names.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendName);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

}
