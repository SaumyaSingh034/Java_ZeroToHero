package Practice;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;

    private SingletonPattern(){

    }

    public SingletonPattern getSingletonPatternInstance(){
        if(singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
