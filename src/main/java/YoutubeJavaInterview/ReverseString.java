package YoutubeJavaInterview;

public class ReverseString {
    public static void main(String[] args){
        String str = "I love java Programming";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        return reverse;
    }
}
