package linkedIn;

public class PrintPermutationOfString {

    public static void main(String[] args){
        String str = "abb";
        printPermutation(str,"");
    }

    private static void printPermutation(String str, String s) {
        if(str.length()==0){
            System.out.println(s+" ");
            return;
        }
        for (int i=0;i<str.length();i++){
            //ith char
            char ch = str.charAt(i);

            //Rest String
            String rem = str.substring(0,i)+str.substring(i+1);

            //Recursive call
            printPermutation(rem, s+ch);
        }
    }
}
