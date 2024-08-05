package DurgaJavaBasicConcepts;

public class OverloadedMainMethod {
    public static void main(String[] args){
        System.out.println("Hello String[] ");
    }
    public static void main(int[] args){
        System.out.println("Hello Int[]");
    }
    public static void main(char[] ch){
        System.out.println("Hello Char[]");
    }
}
