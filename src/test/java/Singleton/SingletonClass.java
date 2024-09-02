package Singleton;

public class SingletonClass {

    private static final SingletonClass single = new SingletonClass();
    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return single;
    }
}
