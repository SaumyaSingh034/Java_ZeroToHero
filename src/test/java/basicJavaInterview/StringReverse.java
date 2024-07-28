package basicJavaInterview;

public class StringReverse {

    public static void main(String[] args){
        String data = "Saumya Singh";
        String reverse = "";

        //Reversing without using any method
        for(int i=data.length()-1;i>=0;i--){
            reverse = reverse+data.charAt(i);
        }
        System.out.println(reverse);
    }
}
