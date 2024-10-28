package SOLID.LiskovSubsitutionPrinciple.WithLSP;

public class Square implements Shape{
    int radius;
    @Override
    public int getArea() {
        return radius * radius;
    }
}
