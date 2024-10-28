package SOLID.OpenClosedPrinciple.WithOCP;

public class Rectangle implements Shape{
    public double weight;
    public double height;
    @Override
    public double area() {
        return weight * height;
    }
}
