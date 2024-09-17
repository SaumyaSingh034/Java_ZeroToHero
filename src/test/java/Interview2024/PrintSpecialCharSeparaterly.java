package Interview2024;

public class PrintSpecialCharSeparaterly {
    
    public static void main(String[] args){
        String word = "abc$##(887711";
        printCharacterSeparaterly(word);
    }

    private static void printCharacterSeparaterly(String word) {
        String chars = word.replaceAll("[\\W\\d]","");

        String special = word.replaceAll("\\w","");
        String digit = word.replaceAll("\\D","");
        System.out.println(chars);
        System.out.println(special);
        System.out.println(digit);
    }
}
