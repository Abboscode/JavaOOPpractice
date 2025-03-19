import java.util.*;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing a Circle"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing a Rectangle"); }
}

class ShapeProcessor {
    
    // TODO: Fix method to accept any list of Shapes or its subtypes
    static void drawAllShapes(List<?> shapes) {
        for (Shape s : shapes) {  // ❌ This line has an error! Fix it
            s.draw();
        }
    }
    
    // TODO: Fix method to allow adding Shapes (or their subclasses)
    static void addShape(List<?> shapes, Shape shape) {
        shapes.add(shape);  // ❌ This line has an error! Fix it
    }
}

public class Main {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());

        // TODO: Call drawAllShapes correctly (using a wildcard)
        ShapeProcessor.drawAllShapes(circles);
        ShapeProcessor.drawAllShapes(rectangles);

        List<Shape> myShapes = new ArrayList<>();
        
        // TODO: Call addShape correctly (using a wildcard)
        ShapeProcessor.addShape(myShapes, new Circle());
        ShapeProcessor.addShape(myShapes, new Rectangle());

        ShapeProcessor.drawAllShapes(myShapes);
    }
}
