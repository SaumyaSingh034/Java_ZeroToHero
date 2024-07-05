package javaInterviewPrep;

public class GetCapitalizedLetterCount {

    public static void main(String[] args) {

        String str = "HiMyNameIsSaumyaSinghIamAutomationTester";

        //1. Using alphabets
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                count1++;

        }
        System.out.println(count1);

        //2. Using ascii
        int count2=0;
        for(int i=0;i< str.length();i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <=90)
                count2++;
        }
        System.out.println(count2);


        //3. Using chars method
        int count3=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                count3++;
        }
        System.out.println(count3);
    }
}
