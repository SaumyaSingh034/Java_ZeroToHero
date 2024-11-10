package November;

public class ReverseWords {
    public static void main(String[] args){
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange"));
    }

    private static StringBuffer revWords(String str) {
        String[] words = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        return sb;
    }
}
