package VIMO_Fitment;

public class ReverseString {
    public static void main(String[] args){
        String s1 = "Try Coding";
        reverseStringAtPlace(s1);
    }

    private static void reverseStringAtPlace(String s1) {
        String[] str = s1.split(" ");
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for(int i=0;i<str.length;i++){

            sb = sb.append(str[i]).reverse();
            result.append(sb+" ");
        }
        System.out.println(result);
    }
}
