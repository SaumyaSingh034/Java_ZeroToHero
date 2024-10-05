public class ReplaceJunkChar {
    public static void main(String[] args){
        String str1 = "%%$^%&%&^*^* Saumya &^&^*^*^Singh";
        str1 = str1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str1);
    }
}
