package javaSessionsNaveen;

public class Car {

    //instance variables
    String name;
    String licenseNumber;
    int price;

    //static variables
    final static int wheelPrice = 24;
    final static String logo = "BMW";

    //creating objects
    public static void main(String[] args){
        Car c1 = new Car();
        c1.name="Swift Desire";
        c1.licenseNumber = "SQQTYUWE";
        c1.price = 879901;

        Car c2 = new Car();
        c2.name="Thar";
        c2.licenseNumber = "TGHYYARE_998";
        c2.price = 108872;

        System.out.println("Object C1 : "+c1.name);
        System.out.println("Object C1 : "+c1.licenseNumber);
        System.out.println("Object C1 : "+c1.price);
        System.out.println("Object C2 : "+c2.name);
        System.out.println("Object C2 : "+c2.licenseNumber);
        System.out.println("Object C2 : "+c2.price);
        System.out.println("Static variable : "+wheelPrice);
        System.out.println("Static variable : "+logo);
        System.out.println("Static variable : ");

    }
}
