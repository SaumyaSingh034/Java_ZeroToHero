package SOLID.OpenClosedPrinciple.withoutOCP;

public class AreaCalculator {
    public double calculateArea(Object shape){
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.height * rectangle.weight;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
            
        }
        throw new UnsupportedOperationException("Shape Not supported");
    }

}
