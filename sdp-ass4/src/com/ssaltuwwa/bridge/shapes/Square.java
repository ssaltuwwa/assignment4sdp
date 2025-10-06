package com.ssaltuwwa.bridge.shapes;

import com.ssaltuwwa.bridge.renderers.Renderer;

// Refined Abstraction 2
public class Square extends Shape {
    private double side;

    public Square(double side, Renderer renderer) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }

    @Override
    public void resize(double factor) {
        side *= factor;
        System.out.printf("Square resized by factor %.2f. New side: %.2f%n", factor, side);
    }

    // Clean Code: meaningful getter
    public double getSide() {
        return side;
    }
}
