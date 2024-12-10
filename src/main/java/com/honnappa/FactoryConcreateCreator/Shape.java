package com.honnappa.FactoryConcreateCreator;

public interface Shape {

    void draw();
}

public class Rectanle implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside reactanle draw method");
    }
}


public class Cirlce implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside circle draw method");
    }
}

public class Square implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside Squqre draw method");
    }
}
