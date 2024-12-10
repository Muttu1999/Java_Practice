package com.honnappa.AbstractFactor;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

   static class RectangleFactory extends AbstractShapeFactory
   {

       @Override
       protected Shape factoryMethod()
       {
           return new Rectangle();
       }
   }

    static class SquareFactory extends AbstractShapeFactory
    {

        @Override
        protected Shape factoryMethod()
        {
            return new Square();
        }
    }

    static class CircleFactory extends AbstractShapeFactory
    {

        @Override
        protected Shape factoryMethod()
        {
            return new Cirlce();
        }
    }
}
