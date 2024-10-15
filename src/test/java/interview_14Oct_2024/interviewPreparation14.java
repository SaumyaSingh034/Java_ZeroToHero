package interview_14Oct_2024;

public class interviewPreparation14 {
    public static void main(String[] args) {
        String original = "hello world, hello everyone!";
        String toReplace = "hello";
        String replacement = "hi";
        String result = replaceString(original, toReplace, replacement);
        System.out.println(result);
    }

    private static String replaceString(String original, String toReplace, String replacement) {
        StringBuffer sb = new StringBuffer();
        String[] words = original.split(" ");
        for(String word : words){
            if(word.equalsIgnoreCase(toReplace))
                sb.append(replacement).append(" ");
            else{
                sb.append(word).append(" ");
            }

        }
        return sb.toString();

    }
}
