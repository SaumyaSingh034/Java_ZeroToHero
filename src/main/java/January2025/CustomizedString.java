package January2025;

public class CustomizedString {
    public static void main(String[] args){
        String s = "MaYANK Is takING InterVIew";
        System.out.println(customizedString(s));

    }

    private static String customizedString(String s) {
        String[] words = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(String word : words){
            sb.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }
}
