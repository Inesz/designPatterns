package com.patterns.design.behavioral.strategy.ex1;

import java.util.Collection;

public abstract class StrategyAbstraction<E> {
    public abstract int count(Collection<E> collection);
}
