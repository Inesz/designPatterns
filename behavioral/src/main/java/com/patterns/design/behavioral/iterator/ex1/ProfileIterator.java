package com.patterns.design.behavioral.iterator.ex1;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
