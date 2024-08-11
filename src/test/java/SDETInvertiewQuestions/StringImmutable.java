package SDETInvertiewQuestions;

public class StringImmutable {
    public static void main(String[] args){
        String s = "Saumya";
        String j = s.concat("Singh");
        System.out.println(s);
        System.out.println(j);

        StringBuffer s1 = new StringBuffer("Java");
        StringBuilder s2 = new StringBuilder("Tryaksh");
        System.out.println(s1);
        System.out.println(s2);
        s1.append(" World");
        s2.append(" Singh Bist");
        System.out.println(s1);
        System.out.println(s2);


    }
}
