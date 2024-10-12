package vimoInterviewPreparation;

public class RemoveWhitsSpaces {
    public static void main(String[] args){
        String str = " Hi I M aking interview ";
        System.out.println(removeWhiteSpaces(str));

    }

    static String removeWhiteSpaces(String str){
        StringBuffer sb = new StringBuffer();
        char[] charArray = str.toCharArray();
        for(char c: charArray){
            if(!Character.isWhitespace(c))
                sb.append(c);
        }
        return sb.toString();
    }
}
