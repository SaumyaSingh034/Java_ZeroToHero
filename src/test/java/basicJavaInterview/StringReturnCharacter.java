package basicJavaInterview;

import java.util.HashMap;

public class StringReturnCharacter {
    public static void main(String[] args){
        String str = "mississipi";
        System.out.println(countCharacterOccursMost(str));
    }

    private static char countCharacterOccursMost(String str) {
        HashMap<Character, Integer> hashCount = new HashMap<>();
        int count =0;
        char ch = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            hashCount.put(c, hashCount.getOrDefault(c,0)+1);

            if(count<hashCount.get(c)){
                ch = c;
                count = hashCount.get(c);
            }
        }
        return ch;


    }
}
