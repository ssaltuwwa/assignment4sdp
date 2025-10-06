package com.ssaltuwwa.bridge.shapes;

import com.ssaltuwwa.bridge.renderers.Renderer;

// Abstraction
public abstract class Shape {
    protected Renderer renderer;

    // Bridge - composition over inheritance
    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(double factor);
}