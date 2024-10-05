import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWord {

    public static void main(String[] args){
        String str = "I am learning learning java java java programming";
        String[] words = str.split("\\s");
        Set<String> stringSet = new HashSet<>(List.of(words));
        System.out.println(stringSet);

        Set<String> newStringSet = new LinkedHashSet<>();
        for(String word : words)
            newStringSet.add(word);
        System.out.println(String.join(" ",newStringSet));
    }
}
