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
    
    // ✅ Use "? extends Shape" to allow any subtype of Shape (for reading)
    static void drawAllShapes(List<? extends Shape> shapes) {
        for (Shape s : shapes) {  // Now it's correct ✅
            s.draw();
        }
    }
    
    // ✅ Use "? super Shape" to allow adding Shapes (for writing)
    static void addShape(List<? super Shape> shapes, Shape shape) {
        shapes.add(shape);  // Now it's correct ✅
    }
}

public class Main {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());

        // ✅ Can read from any subtype of Shape
        ShapeProcessor.drawAllShapes(circles);
        ShapeProcessor.drawAllShapes(rectangles);

        List<Shape> myShapes = new ArrayList<>();
        
        // ✅ Can add Shape or any subclass of it
        ShapeProcessor.addShape(myShapes, new Circle());
        ShapeProcessor.addShape(myShapes, new Rectangle());

        ShapeProcessor.drawAllShapes(myShapes);
    }
}
