package InterviewPrep2024;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I am a java Tester";

        // Call the method to reverse each word in the sentence
        String reversedSentence = reverseEachWord(sentence);

        // Print the result
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    private static String reverseEachWord(String sentence) {
        StringBuffer sb = new StringBuffer();
        String[] str = sentence.split(" ");
        for(String s : str){
            StringBuffer reverseWord = new StringBuffer(s);
            sb.append(reverseWord.reverse()).append(" ");
        }
        return sb.toString().trim();
    }
}
