package BrightlySoftware;

public class LogicalQuestion {
    static int i = 3;
    public static void main(String[] args){
        System.out.println(i+","); //3
        add(i);
        System.out.println(i);//3
    }

    private static void add(int i) {

        i += 5; //8
        System.out.println(i);
    }
}
