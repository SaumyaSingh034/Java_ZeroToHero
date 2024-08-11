package SDETInvertiewQuestions;

public class Tesla extends BMW implements AutomobileCar{
    @Override
    public void displayCarLogo() {
        System.out.println("TESLA");
        System.out.println(super.getmanufacture());
        System.out.println(super.getOwner());
    }

    @Override
    public void carName() {

    }
}
