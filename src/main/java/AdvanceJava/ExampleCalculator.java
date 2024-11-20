package AdvanceJava;

public class ExampleCalculator {
    public static void main(String[] args){
        Calculator add = (a,b)->a+b;
        System.out.println(add.calculator(5,3));
    }
}
