package OOPS.Inheritence;

public class ClothingProduct extends Product{
    private String size;
    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displaySize() {
        System.out.println("Size: " + size);
    }
}
