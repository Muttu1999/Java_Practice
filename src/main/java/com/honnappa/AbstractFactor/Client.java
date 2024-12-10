package com.honnappa.AbstractFactor;

public class Client {

    public static void main(String[] args) {


        Shape shape1 = new AbstractShapeFactory.CircleFactory().getShape();
        shape1.draw();


        Shape shape2 = new AbstractShapeFactory.RectangleFactory().getShape();
        shape2.draw();


        Shape shape3 = new AbstractShapeFactory.SquareFactory().getShape();
        shape3.draw();
    }
}
