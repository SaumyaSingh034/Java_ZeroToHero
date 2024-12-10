package InterviewPrep2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElementInArray {
    public static void main(String[] args){
        String[] str = {"saumya","saumya","java","java","offer","offer","letter","luck"};
        removeDuplicateElement(str);
    }

    private static void removeDuplicateElement(String[] str) {
        Set<String> setString = new LinkedHashSet<>();
        for(String s : str){
            setString.add(s);
        }
        System.out.println(setString);
    }
}
