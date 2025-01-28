package January2025;

public class CustomizeReverseString {
    public static void main(String[] args){
        String words = "Today it rained heavily at my home";
        System.out.println(reverseCustomizedString(words));
        System.out.println(reverseReverseCustomizedString(words));
    }

    private static String reverseCustomizedString(String words) {
        String[] arr = words.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i= arr.length-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }

    private static String reverseReverseCustomizedString(String words) {
        String[] arr = words.split("\\s+");
        StringBuffer result = new StringBuffer();
        for(int i= arr.length-1;i>=0;i--){
            StringBuffer sb = new StringBuffer(arr[i]);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
