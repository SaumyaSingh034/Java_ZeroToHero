package AbstractInterface;

public class Test {
    public static void main(String[] args){
        String x = "I am Saumya Singh";
        System.out.println(revsereString(x));
        System.out.println(revsereWordsString(x));
    }

    private static String revsereWordsString(String x) {
        String[] arr = x.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String i : arr){
            StringBuffer sb1 = new StringBuffer(i);
            sb.append(sb1.reverse()).append(" ");
        }
        return sb.toString().trim();
    }

    private static String revsereString(String x) {
        String reverse = "";
        for(int i=x.length()-1;i>=0;i--){
            reverse += x.charAt(i);
        }
        return reverse;
    }
}
