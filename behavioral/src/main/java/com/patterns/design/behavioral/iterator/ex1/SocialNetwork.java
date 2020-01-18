package com.patterns.design.behavioral.iterator.ex1;

public interface  SocialNetwork {
    ProfileIterator createFriendsIterator(String profileName);
}
