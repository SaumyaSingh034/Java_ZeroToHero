package vimoInterviewPreparation;

public class Interview2 {
    public static void main(String[] args){
        String s = "MaYANK Is takING InterVIew";
        String formattedSentence = formatSentence(s);
        System.out.println(formattedSentence);
    }

    private static String formatSentence(String s) {
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String word : words){
            if(word.length()>2){
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");
            } else{
                sb.append(word.toLowerCase()).append(" ");
            }
        }
        return sb.toString();
    }
}
