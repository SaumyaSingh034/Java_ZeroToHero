package AbstractInterface;

public interface Car {

    final String author = "Saumya";
    static String authorLastName = "Singh";

    public void carName();
    public void carManufacture();

    public void carLogo();

    public static void carOwner() {
        System.out.println("Hello I am Car Owner from Interface");
    }
}
