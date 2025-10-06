package com.ssaltuwwa.bridge.renderers;

// Concrete Implementor 1
public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("Drawing a circle of radius %.2f using vector graphics%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Drawing a square with side %.2f using vector graphics%n", side);
    }
}