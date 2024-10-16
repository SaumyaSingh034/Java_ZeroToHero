package VIMO_Fitment;

public class SingletonPattern {

    //static
    private static SingletonPattern sp;

    //private constructor
    private SingletonPattern() {};

    //using getter methos to get the instance copy
    public static SingletonPattern getInStance(){
        if(sp==null){
            sp = new SingletonPattern();
        }
        return sp;
    }
}
