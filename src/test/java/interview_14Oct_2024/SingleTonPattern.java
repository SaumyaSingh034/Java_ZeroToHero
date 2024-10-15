package interview_14Oct_2024;

public class SingleTonPattern {
    private static SingleTonPattern sp = new SingleTonPattern();
    private SingleTonPattern(){

    }
    public static SingleTonPattern getSingletonPattern(){
        return sp;
    }
}
