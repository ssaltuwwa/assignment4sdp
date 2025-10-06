package com.ssaltuwwa.bridge.shapes;

import com.ssaltuwwa.bridge.renderers.Renderer;

// Refined Abstraction 1
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Renderer renderer) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.printf("Circle resized by factor %.2f. New radius: %.2f%n", factor, radius);
    }

    // Clean Code: meaningful getter
    public double getRadius() {
        return radius;
    }
}