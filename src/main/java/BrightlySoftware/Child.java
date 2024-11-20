package BrightlySoftware;

public class Child extends Parent{

    public static void display(){
        System.out.print("Child");
    }


    public void test(){
        System.out.print("Chile ");
    }

    public static void main(String[] args){
        Parent p = new Child();
        p.test();

    }
}
