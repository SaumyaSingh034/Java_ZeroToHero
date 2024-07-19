package javaInterviewPrep;

public class DuplicateCharacterCount {

    public static void main(String[] args){
        String s = "manojpandey";

        countDuplicateCharacter(s);
    }

    private static void countDuplicateCharacter(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        for(int i=0;i< ch.length;i++){
            for(int j=1;j< ch.length;j++)
            {
                if(ch[i] == ch[j])
                    count++;
                System.out.println("word "+ ch[i]+" count--> "+count);
            }


        }
    }
}
