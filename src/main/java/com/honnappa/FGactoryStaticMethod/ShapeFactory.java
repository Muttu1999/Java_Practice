package com.honnappa.FGactoryStaticMethod;

import com.honnappa.FactoryConcreateCreator.Cirlce;
import com.honnappa.FactoryConcreateCreator.Rectanle;
import com.honnappa.FactoryConcreateCreator.Shape;
import com.honnappa.FactoryConcreateCreator.Square;

public class ShapeFactory {


    public static Shape getShape(String ShapeType)
    {
        if(ShapeType==null)
            return null;
        else if (ShapeType.equalsIgnoreCase("CIRCLE"))
            return new com.honnappa.FactoryConcreateCreator.Cirlce();
        else if (ShapeType.equalsIgnoreCase("RECTANGLE"))
            return new com.honnappa.FactoryConcreateCreator.Rectanle();
        else if (ShapeType.equalsIgnoreCase("SQUARE"))
            return new com.honnappa.FactoryConcreateCreator.Square();

        return null;
    }
}
