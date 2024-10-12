package vimoInterviewPreparation;

public class RemoveGivenCharacterFromString {

    public static void main(String[] args){
        String str1 = "abcdABCDabcdABCD";
        str1 = str1.replaceAll("a","");
        System.out.println(str1);
    }
}
