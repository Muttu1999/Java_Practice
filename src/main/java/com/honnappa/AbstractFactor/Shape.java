package com.honnappa.AbstractFactor;

public interface Shape {

    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectanle MEthoed()");
    }
}

class Cirlce implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle MEthoed()");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square MEthoed()");
    }
}
