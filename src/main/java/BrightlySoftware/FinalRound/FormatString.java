package BrightlySoftware.FinalRound;

public class FormatString {
    public static void main(String[] args) {
        String s = "MaYANK Is takING InterVIew";
        String formattedSentence = formatSentence(s);
        System.out.println(formattedSentence);
    }

    private static String formatSentence(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String word : str){
            if(word.length()>2){
                sb.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase());
            }else{
                sb.append(word.toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
