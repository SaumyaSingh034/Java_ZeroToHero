package InterviewPrep2024;

public class StringManipulation {
    public static void main(String[] args){
        String str = "MaYANK Is takING InterVIew";
        System.out.println(manipulateString(str));
    }

    private static String manipulateString(String str) {
        StringBuffer sb = new StringBuffer();
        String[] words = str.split(" ");
        for(String word : words){
            if(word.length()<3){
                sb.append(word.toLowerCase()).append(" ");
            }else {
            sb.append(word.substring(0,1).toUpperCase())
                    .append(word.substring(1).toLowerCase()).append(" ");
        }}
        return sb.toString().trim();
    }
}
