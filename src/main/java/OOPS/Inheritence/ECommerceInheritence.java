package OOPS.Inheritence;

public class ECommerceInheritence {
    public static void main(String[] args){
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1200.00, "Dell");
        ClothingProduct shirt = new ClothingProduct("T-shirt", 29.99, "M");

        laptop.displayDetails();
        laptop.displayBrand();

        System.out.println("******************");
        shirt.displayDetails();
        shirt.displaySize();
    }
}
