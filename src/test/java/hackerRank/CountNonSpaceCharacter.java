package hackerRank;

public class CountNonSpaceCharacter {
    public static void main(String[] args){
        String input = "This is a string";
        String newInput = input.replaceAll("\\s","");
        System.out.println(newInput.length());
    }
}
