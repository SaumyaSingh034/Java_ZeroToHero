package December2024Prep;

public class SingleTonDesignPattern {

    private SingleTonDesignPattern pattern;

    private SingleTonDesignPattern(){

    }

    public SingleTonDesignPattern getInstance(){
        if (pattern == null) {
            return new SingleTonDesignPattern();
        }
        return null;
    }
}
