package SDET_RahulShetty;

public class StringReverse {

    public static void main(String[] args){
        String s1 = "Saumya Singh";
        String rev = "";

        for(int i=s1.length()-1;i>=0;i--){
            rev += s1.charAt(i);
        }
        System.out.println(rev);
    }
}
