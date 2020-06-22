package com.company;

public abstract class Bird  extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("Breath in and out ");
    }

    @Override
    public void eat() {
        System.out.println("CHik chirik");
    }
    public abstract void fly();
}
