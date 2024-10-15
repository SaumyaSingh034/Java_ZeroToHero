package vimoInterviewPreparation;

public class vowelString {
    public static void main(String[] args){
        String str = "HelloGlobant";

        String processedString = str.replaceAll("[aeiouAEIOU]","");

        if(processedString.length()<5)
            System.out.println("Failure, The length is string is less than 5");
        else
            System.out.println("Success, The length of the string is greater than 5"+processedString);

        if(processedString.length()==str.length()){
            System.out.println("Failure The string donot contains any vowels");
        }

    }
}
