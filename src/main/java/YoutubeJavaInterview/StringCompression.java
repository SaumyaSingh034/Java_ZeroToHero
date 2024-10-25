package YoutubeJavaInterview;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabb";
       System.out.println(stringCompression(str));
    }

    private static String stringCompression(String str) {

        StringBuffer sb = new StringBuffer();
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                count++;
            else {
                sb.append(str.charAt(i - 1)).append(count);
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
       return sb.length() < str.length() ? sb.toString() : str;

    }
}
