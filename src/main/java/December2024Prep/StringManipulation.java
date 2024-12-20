package December2024Prep;

public class StringManipulation {
    public static void main(String[] args){
        String str = "saumyaS29";
        System.out.println("Small Char : "+str.replaceAll("[^a-z\\s]",""));
        System.out.println("Numberic Char : "+str.replaceAll("[^0-9\\s]",""));
        System.out.println("Capital Char : "+str.replaceAll("[^A-Z\\s]",""));
    }
}
