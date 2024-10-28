package SOLID.LiskovSubsitutionPrinciple.WithLSP;

public class Rectangle implements Shape{
    int weight, height;
    @Override
    public int getArea() {
        return weight * height;
    }
}
