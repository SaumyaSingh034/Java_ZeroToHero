package Tata;

public class Regex1 {
    public static void main(String[] args){
        String str = "abcd23";
        String str1 = str.replaceAll("[^0-9]","");
        System.out.println(str1);
        char[] ch = str1.toCharArray();
        int sum = 0;
        for(int i=0;i<ch.length;i++){
            sum = sum + Character.getNumericValue(ch[i]);

        }
        System.out.println(sum);

    }
}
