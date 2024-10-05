import java.io.FileNotFoundException;

public class TryCatchBlock {
    public static void main(String[] args){
        System.out.println(tryCatchData());
    }


    private static int tryCatchData(){
        try{
            int a = 10/0;
            return 10;
        } catch (ArrayIndexOutOfBoundsException ef){
            System.out.println("Array Index Out of Bound");
            return 200;
        } catch (ArithmeticException eA){
            System.out.println("Arithemetic Exception");
            return 500;
        } catch (Exception e){
            System.out.println("Exception E Printed");
            return 100;
        } finally {
            System.out.println("Finally Data");
            return 8000;
        }

    }
}
