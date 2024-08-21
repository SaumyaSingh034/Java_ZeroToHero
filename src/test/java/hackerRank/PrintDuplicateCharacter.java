package hackerRank;

import java.util.HashSet;

public class PrintDuplicateCharacter {

    public static void main(String[] args){
        String input = "hackerearth";
        System.out.println(printDuplicateCharacter(input));
    }

    private static String printDuplicateCharacter(String input) {
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(hashSet.contains(input.charAt(i)))
                sb.append(input.charAt(i)+" ");
            else{
                hashSet.add(input.charAt(i));
            }
        }
        return  sb.reverse().toString();
    }
}
