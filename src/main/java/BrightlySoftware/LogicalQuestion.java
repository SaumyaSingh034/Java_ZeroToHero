package BrightlySoftware;

public class LogicalQuestion {
    static int i = 3;
    public static void main(String[] args){
        System.out.println(i+",");
        add(i);
        System.out.println(i);
    }

    private static void add(int i) {
        i += 5;
    }
}
