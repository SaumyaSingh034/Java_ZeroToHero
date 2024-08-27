package javaSessionsNaveen;

public class StaticVariables {
    static int count = 0;

    public static void main(String[] args){
        StaticVariables sv1 = new StaticVariables();
        StaticVariables sv2 = new StaticVariables();
        StaticVariables sv3 = new StaticVariables();


    }

    StaticVariables(){
        count++;
        System.out.println(count);
    }
}
