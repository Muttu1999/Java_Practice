package com.honnappa.FactoryConcreateCreator;

public class Create {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectanglr = shapeFactory.getShape("RECTANGLE");
        rectanglr.draw();

        Shape sqare = shapeFactory.getShape("SQUARE");
        sqare.draw();
    }
}
