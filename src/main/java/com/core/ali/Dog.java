package com.core.ali;

public class Dog implements Animal {
    private String name;


    @Override
    public void move() {
        System.out.println("dog move");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
