package vimoInterviewPreparation;

public class ConsecutiveCharacterGroup {
    public static void main(String[] args){
        String input = "geekksforgggeeks";
        int result = countConsecutiveGroup(input);
        System.out.println("Total groups of consecutive characters: " + result);

    }

    private static int countConsecutiveGroup(String str){
        int group = 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)== str.charAt(i-1)){
                if(i==1 || str.charAt(i-1) != str.charAt(i-2)){
                    group++;
                }
            }
        }
        return group;
    }
}
