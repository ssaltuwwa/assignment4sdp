package com.ssaltuwwa.bridge;

import com.ssaltuwwa.bridge.renderers.RasterRenderer;
import com.ssaltuwwa.bridge.renderers.Renderer;
import com.ssaltuwwa.bridge.renderers.VectorRenderer;
import com.ssaltuwwa.bridge.shapes.Circle;
import com.ssaltuwwa.bridge.shapes.Shape;
import com.ssaltuwwa.bridge.shapes.Square;

// Client code
public class BridgeDemo {
    public static void main(String[] args) {
        // Create renderers
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        // Create shapes with different renderers
        Shape circle = new Circle(5.0, vectorRenderer);
        Shape square = new Square(10.0, rasterRenderer);

        // Demonstrate the bridge pattern
        System.out.println("=== Drawing Shapes ===");
        circle.draw();
        square.draw();

        System.out.println("\n=== Resizing and Redrawing ===");
        circle.resize(2.0);
        square.resize(0.5);

        circle.draw();
        square.draw();

        // Show flexibility: same shape with different renderers
        System.out.println("\n=== Same Shape, Different Renderers ===");
        Shape circleWithRaster = new Circle(7.0, rasterRenderer);
        Shape squareWithVector = new Square(8.0, vectorRenderer);

        circleWithRaster.draw();
        squareWithVector.draw();
    }
}