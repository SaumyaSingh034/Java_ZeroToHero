package hackerRank;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateCharacter {

    public static void main(String[] args){
        String input = "hackerearth";
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(hashSet.contains(input.charAt(i)))
                continue;
            else {
                hashSet.add(input.charAt(i));
            }

        }
        System.out.println(hashSet.toString());
    }
}
