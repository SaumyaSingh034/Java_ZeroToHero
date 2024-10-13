package vimoInterviewPreparation;

public class ReverseWords {

    public static void main(String[] args){
        String sentence = "Hello World from Java";
        String result = reverseWords(sentence);
        System.out.println(result);
    }

    private static String reverseWords(String sentence) {
        StringBuffer sb = new StringBuffer();
       String[] words = sentence.split(" ");
       for(int i= words.length-1;i>=0;i--){
           sb.append(words[i]+" ");
       }
       return sb.toString();
    }
}
