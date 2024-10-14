package vimoInterviewPreparation;

public class SingletonPattern {
    private static SingletonPattern sp = new SingletonPattern();
    private SingletonPattern(){}

    public static SingletonPattern getObject(){
        return sp;
    }

}
