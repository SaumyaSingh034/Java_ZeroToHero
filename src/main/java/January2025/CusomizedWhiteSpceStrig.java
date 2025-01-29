package January2025;

public class CusomizedWhiteSpceStrig {
    public static void main(String[] args){
        String str = " Hi I M aking interview ";
        System.out.println(customizedStringSpace(str));
    }

    private static String customizedStringSpace(String str) {
        StringBuffer sb = new StringBuffer();
        for(char c : str.toCharArray()){
            if(!Character.isWhitespace(c))
                sb.append(c);
        }
        return sb.toString();
    }
}
