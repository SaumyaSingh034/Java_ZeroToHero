public class Vowels {

    public static void main(String[] args){
        String str = "helloSaumya";
        String s;
        StringBuffer sb = new StringBuffer();
        s = str.replaceAll("[aeiou]","");
        System.out.println(s);
    }
}
