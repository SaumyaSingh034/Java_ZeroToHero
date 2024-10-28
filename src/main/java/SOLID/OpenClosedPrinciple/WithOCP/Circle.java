package SOLID.OpenClosedPrinciple.WithOCP;

public class Circle implements Shape{
    public double radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
