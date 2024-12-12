package AbstractInterface;

public class Test2 {
    public static void main(String[] args) {
        String x = "34test909gda@sdet!23pro";

        //34tset909adg@teds!23orp
        System.out.println(manipulateStringandReverse(x));

    }

    private static String manipulateStringandReverse(String x) {
        System.out.println(x.matches("//d")); //34909
        char[] ch = x.toCharArray();
        StringBuffer sb = new StringBuffer();

        StringBuffer result = new StringBuffer();
        String temp = "";
        for (char c : ch) {

            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        sb.reverse();
        int alphaIndex = 0;
        for (char c : ch) {
            if (Character.isAlphabetic(c)) {
                result.append(sb.charAt(alphaIndex));
                alphaIndex++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
