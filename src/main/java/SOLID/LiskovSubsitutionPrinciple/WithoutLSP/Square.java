package SOLID.LiskovSubsitutionPrinciple.WithoutLSP;

public class Square extends Rectangle{

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.weight = weight;

    }
}
