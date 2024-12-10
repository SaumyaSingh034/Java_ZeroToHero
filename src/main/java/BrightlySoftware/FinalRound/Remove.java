package BrightlySoftware.FinalRound;

public class Remove {
    public static void main(String[] args) {
        String str = "Automation Software Engineer";
        String wordToRemove = "Automation";
       System.out.println( buildString(str, wordToRemove));
}

    private static String buildString(String str, String wordToRemove) {
        String[] st = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String s : st){
            if(!s.equalsIgnoreCase(wordToRemove)){
                sb.append(s).append(" ");
            }

        }
        return sb.toString().trim();

    }
    }
