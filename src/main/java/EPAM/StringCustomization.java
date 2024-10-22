package EPAM;

public class StringCustomization {
    public static void main(String[] args){
        String input = "I am Rajesh, currently attending, interview with, abc systems";
        stringCustomizationOutput(input);
    }

    private static void stringCustomizationOutput(String input) {
        String[] words = input.split(",");
        StringBuffer sb = new StringBuffer();
        for(String word : words){
            String[] w = word.split(" ");
            for(int i=w.length-1;i>=0;i--){
                sb.append(w[i]+" ");
            }
            sb.append(",");
        }
        System.out.println(sb);
    }
}
