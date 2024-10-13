package vimoInterviewPreparation;

public class Interview3 {

    public static void main(String[] args){
        String words = "Today it rained heavily at my home";
        reverseWordsString(words);
    }

    private static void reverseWordsString(String words) {
        String[] word = words.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i = word.length-1;i>=0;i--){
            result.append(word[i]+" ");
        }
        System.out.println(result);
    }
}
