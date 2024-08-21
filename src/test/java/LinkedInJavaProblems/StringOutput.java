package LinkedInJavaProblems;

public class StringOutput {

    public static void main(String[] args){
        String input = "i am a java guy";
        String withOutSpaces = input.replaceAll("\\s","");
        System.out.println(withOutSpaces);
        char[] reversedArray = new StringBuilder(withOutSpaces).reverse().toString().toCharArray();
       StringBuilder finalOutput = new StringBuilder();
       for(int i=0,j=0;i<input.length();i++){
           if(input.charAt(i) == ' ')
               finalOutput.append(' ');
           else
               finalOutput.append(reversedArray[j++]);
       }
       System.out.println(finalOutput);
    }
}
