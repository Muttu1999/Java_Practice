package com.honnappa.FactoryConcreateCreator;

public  class ShapeFactory {

    public  Shape getShape(String ShapeType)
    {
        if(ShapeType==null)
            return null;
        else if (ShapeType.equalsIgnoreCase("CIRCLE"))
            return new Cirlce();
        else if (ShapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectanle();
        else if (ShapeType.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }
}
