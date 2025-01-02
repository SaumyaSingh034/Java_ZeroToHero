package VIMO_Fitment;

import org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal;

@FunctionalInterface
public interface Calculator {

    public int addition(int a, int b);
    default void display(){
        System.out.println("Hello From display");
    }
}
