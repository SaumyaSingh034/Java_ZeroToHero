package OOPS.Inheritence;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}
