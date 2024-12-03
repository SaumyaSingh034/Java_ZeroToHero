package BrightlySoftware.FinalRound;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }

    private static String revWords(String str) {
        StringBuffer sb = new StringBuffer();
        String[] word = str.split(" ");
       for(int i= word.length-1;i>=0;i--){
           sb.append(word[i].substring(0,1).toUpperCase()).append(word[i].substring(1).toLowerCase())
                   .append(" ");
       }
       return sb.toString().trim();
    }

}
