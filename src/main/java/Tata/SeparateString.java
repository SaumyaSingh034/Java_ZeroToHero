package Tata;

public class SeparateString {
    public static void main(String[] args){
        String input = "saumyaTR29 singh";
        String i = input.replaceAll("[^*aei0u*]","");
        System.out.println(i);
        StringBuilder small = new StringBuilder();
        StringBuilder caps = new StringBuilder();
        StringBuilder digit = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isLowerCase(c))
                small.append(c);
            if(Character.isUpperCase(c))
                caps.append(c);
            if(Character.isDigit(c))
                digit.append(c);
        }

        System.out.println(small);
        System.out.println(caps);
        System.out.println(digit);
    }
}
