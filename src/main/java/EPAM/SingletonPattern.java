package EPAM;

public class SingletonPattern {
    private static SingletonPattern sp;

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        if(sp==null){
            sp = new SingletonPattern();
        }
        return sp;
    }
}
