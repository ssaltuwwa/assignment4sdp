package com.ssaltuwwa.bridge.renderers;

// Concrete Implementor 2
public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("Rendering a circle of radius %.2f as pixels%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Rendering a square with side %.2f as pixels%n", side);
    }
}