package javaInterviewPrep;

public class DuplicateCharacterCount {

    public static void main(String[] args){
        String s = "manojpandey";

        countDuplicateCharacter(s);
    }

    private static void countDuplicateCharacter(String s) {

        char[] ch = s.toCharArray();
        for(int i=0;i< ch.length;i++){
            int count = 0;
            for(int j=1;j< ch.length;j++)
            {
                if(ch[i] == ch[j])
                    count++;

            }
            if(count>=2)
                System.out.println("word "+ ch[i]+" count--> "+count);


        }
    }
}
