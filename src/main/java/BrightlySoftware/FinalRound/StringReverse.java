package BrightlySoftware.FinalRound;

public class StringReverse {
    public static void main(String[] args) {
        String sentence = "I am a java Tester";
        String reversedSentence = reverseEachWord(sentence);

        // Print the result
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    private static String reverseEachWord(String sentence) {
        StringBuffer sb = new StringBuffer();

        String[] s = sentence.split(" ");
        for(String k : s){
            StringBuffer rev = new StringBuffer(k);
            sb.append(rev.reverse().toString()).append(" ");
        }
        return sb.toString();
    }
}
