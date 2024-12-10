package InterviewPrep2024;

public class RemoveWordFromString {
    public static void main(String[] args){
        String str = "Automation Software Engineer";
        String wordToRemove = "Automation";

        if(str.startsWith(wordToRemove)){
            System.out.println(str.substring(wordToRemove.length()).trim());
        }else
            System.out.println(str);
    }
}
