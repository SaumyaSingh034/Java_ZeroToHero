package Interview2024;

public class ReverseAlternateWords {
    public static void main(String[] args){
        String str = "selenium cypress playwright webdriverio";
        reverseAlternateWords(str);
    }

    private static void reverseAlternateWords(String str) {
        String[] words = str.split("\\s+");
        for(int i=0;i< words.length;i++){
            if(i%2!=0){
                words[i] = new StringBuffer(words[i]).reverse().toString();
            }
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
