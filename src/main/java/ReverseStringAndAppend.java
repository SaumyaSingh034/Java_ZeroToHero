public class ReverseStringAndAppend {
    public static void main(String[] args){
        String str = "Hello World";
        StringBuffer result = new StringBuffer(str);
        result.append(" ");
        String[] words = str.split(" ");
        for(int i = words.length-1;i>=0;i--){
            result.append(words[i]+" ");
        }
        System.out.println(result);

    }
}
