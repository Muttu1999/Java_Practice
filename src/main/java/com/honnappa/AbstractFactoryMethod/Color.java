package com.honnappa.AbstractFactoryMethod;

public interface Color {

    void fill();
}

class Red implements Color
{

    @Override
    public void fill()
    {
        System.out.println("Inside red fill method");
    }
}

class Green implements Color
{

    @Override
    public void fill()
    {
        System.out.println("Inside Green fill method");
    }
}

class Blue implements Color
{

    @Override
    public void fill()
    {
        System.out.println("Inside Blue fill method");
    }
}

