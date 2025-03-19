# JavaOOPpractice
small project where you need to use wildcards (? extends, ? super) correctly.
# Project: Generic Shape Drawer 🎨
You're building a shape drawing system. You have three classes:

# Shape (base class)
Circle and Rectangle (both extend Shape)
The system needs to:

# Store different types of shapes.
Process lists of shapes correctly using wildcards.
Starter Code (Incomplete)
Your task is to fix and complete the ShapeProcessor class using wildcards correctly.

# Hints 🧐
Fix drawAllShapes()

# You need a wildcard that allows reading shapes from the list.
Use ? extends Shape (because we are reading from the list).
Fix addShape()

# You need a wildcard that allows adding shapes to the list.
Use ? super Shape (because we are writing to the list).
# Expected Output ✅

Drawing a Circle
Drawing a Rectangle
Drawing a Circle
Drawing a Rectangle
# Solution
## Why This Works?
drawAllShapes(List<? extends Shape>)

? extends Shape allows reading any subclass of Shape (Circle, Rectangle).
We can iterate over the list and call draw() safely.
addShape(List<? super Shape>, Shape shape)

? super Shape allows adding Shape and its subclasses.
The list could be List<Shape> or even List<Object>, which is fine for adding Shape.
