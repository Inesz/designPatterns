package com.patterns.design.behavioral.com.patterns.design.behavioral.templateMethod.ex1;

public abstract class Worker {
    public Worker() {
        this.beginWork();
        this.startBreak();
        this.stopBreak();
        this.startBreak();
        this.stopBreak();
        this.endWork();
    }

    protected abstract void beginWork();

    protected abstract void endWork();

    protected void startBreak() {
        System.out.println("startBreak");
    }

    protected void stopBreak() {
        System.out.println("stopBreak");
    }
}
