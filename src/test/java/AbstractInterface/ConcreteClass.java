package AbstractInterface;

public class ConcreteClass extends AbstractCarname{
    @Override
    public void carManufacture() {
        System.out.println("Hello Car Manufacture from Concrete class");
    }

    @Override
    public void carLogo() {
        System.out.println("Hello Car Logo from Concrete class");
    }

    public static void main(String[] args){
        Car c = new ConcreteClass();
        c.carLogo();
        c.carManufacture();
        c.carName();
        Car.carOwner();
        System.out.println(Car.author+Car.authorLastName);
    }
}
