package SDETInvertiewQuestions;

public class ReverseString {
    public static void main(String[] args){
        String str = "Saumya Singh";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        StringBuilder strB = new StringBuilder("Hello Word");
        System.out.println(strB.reverse());
    }
}
