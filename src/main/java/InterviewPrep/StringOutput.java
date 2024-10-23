package InterviewPrep;

public class StringOutput {
    public static void main(String[] args){
        String str = "Automation Software InterviewPrep.Test Engineer";
        String wordToRemove = "Automation";
        String result = "";

        int wordLength = wordToRemove.length();
        boolean startwithWord = true;
        for(int i=0; i< wordLength; i++) {
            if(str.charAt(i)!= wordToRemove.charAt(i)){
                startwithWord = false;
                break;
            }
        }

        if(startwithWord) {
            for (int i=wordLength;i<str.length();i++){
                result += str.charAt(i);
            }
        }else {
            result = str;
        }
        System.out.println(result.trim());
    }

}
