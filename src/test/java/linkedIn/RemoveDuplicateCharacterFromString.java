package linkedIn;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args){
        RemoveDuplicateCharacterFromString rs = new RemoveDuplicateCharacterFromString();
        System.out.println(rs.removeDuplicateCharacter1("saumya"));
        System.out.println(rs.removeDuplicateCharacter2("saumya"));
    }


    private String removeDuplicateCharacter1(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length()-1;i++){
            for(int j=1;j<str.length();j++){
                if(str.charAt(i) != str.charAt(j))
                {sb.append(str.charAt(i));
                    i++;
            }
        }}
        return sb.toString();


    }
    private String removeDuplicateCharacter2(String str){
        Map<Character, Integer> key = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(key.containsKey(str.charAt(i)))
                key.put(str.charAt(i),key.get(str.charAt(i))+1);
            else
            {
                key.put(str.charAt(i),1);
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
    }
}
