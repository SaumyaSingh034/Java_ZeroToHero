package javaInterviewPrep;

public class CountOccurenceOfCharacter {

    public static void main(String[] args){

        String s = "Saumya";
        countChar(s, 'a');

    }

    public static void countChar(String s, char c){
        int count =0;
        for(int i=0;i<s.length();i++){
            if(c == s.charAt(i)){
                count++;
            }
        }
        System.out.println("Count of character  "+c+" is : "+count);
    }
}
