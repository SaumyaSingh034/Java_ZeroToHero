package BrightlySoftware.FinalRound;

public class ThreadSafeSingletonClass {
    private static volatile ThreadSafeSingletonClass instance;

    private ThreadSafeSingletonClass(){

    }

    public static ThreadSafeSingletonClass getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingletonClass.class){
                if(instance == null){
                    instance = new ThreadSafeSingletonClass();
                }
            }

        }
        return instance;
    }
}
