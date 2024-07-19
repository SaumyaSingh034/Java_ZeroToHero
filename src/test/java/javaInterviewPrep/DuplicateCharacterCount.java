package javaInterviewPrep;

public class DuplicateCharacterCount {

    public static void main(String[] args){
        String s = "manojpandey";

        countDuplicateCharacter(s);
    }

    private static void countDuplicateCharacter(String s) {
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1))
                count++;
            System.out.println("word "+s.charAt(i)+" count--> "+count);
        }
    }
}
