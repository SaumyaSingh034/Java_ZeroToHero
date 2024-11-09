package OOPS.Inheritence;

public class ElectronicProduct extends Product{
    private String brand;

    public ElectronicProduct(String name, double price, String brand){
        super(name, price);
        this.brand = brand;

    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }


}
