package JavaInterviewQuestions;

public class StringToInteger {

    public static void main(String[] args){
        String s = "998";
        System.out.println("String value : "+s);
        System.out.println(s+999);
        int x = Integer.parseInt(s);
        System.out.println("Integer value : "+x);
        System.out.println(x+999);
    }
}
