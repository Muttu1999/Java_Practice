package com.honnappa.FGactoryStaticMethod;

public interface Shape {

    void draw();
}

class Rectanle implements com.honnappa.FactoryConcreateCreator.Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside reactanle draw method");
    }
}


class Cirlce implements com.honnappa.FactoryConcreateCreator.Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside circle draw method");
    }
}

class Square implements com.honnappa.FactoryConcreateCreator.Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside Squqre draw method");
    }
}
