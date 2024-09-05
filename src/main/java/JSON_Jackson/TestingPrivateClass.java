package JSON_Jackson;

public class TestingPrivateClass {

    public static void main(String[] args){
        String s1 = new String("Saumya");
        String s2 = new String("Saumya");

        System.out.println(s1.equals("Saumya"));
        System.out.println("Saumya".equals(s1));
        System.out.println(s1.intern() == s2.intern());
    }
}
