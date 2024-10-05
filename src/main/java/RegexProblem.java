public class RegexProblem {

    public static void main(String[] args){
        String s1 = "A";
        String s2 = "2";
       // System.out.println(regexSolution(s1,s2));
        System.out.println(regexSolution("3","4"));
        System.out.println(regexSolution("(*(**)","(*)(*)*"));
        System.out.println(regexSolution("9888","IUU89"));
    }

    private static String regexSolution(String s1, String s2){
        if(isDigit(s1) && isDigit(s2)){
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            return String.valueOf(a+b);
        } else if (isAlphabet(s1) && isAlphabet(s2)) {
            return s1+s2;
        }
       else{
           return s1+s2;
        }
    }

    private static boolean isDigit(String s){
        return s.matches("[\\d]");
    }

    private static boolean isAlphabet(String s){
        return s.matches("[\\W]");
    }
}
