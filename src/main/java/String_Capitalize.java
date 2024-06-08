public class String_Capitalize {

    public static void main(String[] args){
        String str = "naveen automation labs";

        System.out.println(captilizeString(str));

    }

    public static String captilizeString(String str){
        String[] words = str.split("\\s");
        String result = "";
        for (String word : words){
            String first = word.substring(0,1).toUpperCase();
            String rest = word.substring(1);
            result = result+first+rest;
        }
        return result;
    }
}
