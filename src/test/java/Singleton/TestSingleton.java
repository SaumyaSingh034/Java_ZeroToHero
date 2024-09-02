package Singleton;

public class TestSingleton {

    public static void main(String[] args){
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        if(s1==s2)
        {
            System.out.println("Both objects are same");
        }
    }
}
