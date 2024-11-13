package BrightlySoftware;

public class VowelCountWord {
    public static void main(String[] args){
        String str = "Java Programming is best language tytyty";
        countVowelWords(str);
        countVowelWordsThroughChatGPT("Saumya Singh ghwty");
    }

    private static void countVowelWords(String str) {
        String[] words = str.split(" ");
        int count=0;
        for(String word : words){
            if(word.contains("a")||word.contains("e")||
                    word.contains("i")||word.contains("o")
            ||word.contains("u")){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void countVowelWordsThroughChatGPT(String str){
        String[] words = str.split(" ");
        int count=0;
        for(String word : words){
            if(containsVowel(word)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean containsVowel(String word) {
        for(char c : word.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1)
                return true;
        }
        return false;
    }
}
