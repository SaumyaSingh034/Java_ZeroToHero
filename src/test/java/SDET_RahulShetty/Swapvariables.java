package SDET_RahulShetty;

public class Swapvariables {

    public static void main(String[] args){
        int a = 8;
        int b = 9;

        int temp;
        temp = a;
        a = b;
        b=temp;
        System.out.println(a+"     "+b);


        int x = 10;
        int z = 3;
        x = x+z; //7
        z = x-z; //7+3 10
        x = x-z; //7+10
        System.out.println(x+"     "+z);
    }
}
