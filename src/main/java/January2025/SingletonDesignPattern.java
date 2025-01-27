package January2025;

public class SingletonDesignPattern {
    private SingletonDesignPattern sng;

    private SingletonDesignPattern(){

    }
    public SingletonDesignPattern getInstance(){
        return sng = new SingletonDesignPattern();
    }
}
