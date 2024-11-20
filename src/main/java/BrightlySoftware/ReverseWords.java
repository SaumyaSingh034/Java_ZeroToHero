package BrightlySoftware;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }

    private static String revWords(String str) {
        String[] words = str.split("\\s");
        StringBuffer sb = new StringBuffer();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i].substring(0,1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase()).append(" ");
        }
        return sb.toString();
    }

}