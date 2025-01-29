package January2025;

public class CustomizedVowelString {
    public static void main(String[] args){
        String str = "Hello Globant Saumya Here";
        String result = str.replaceAll("[aeiouAEIOU]","");
        // result = str.replaceAll(" ","");
        System.out.println(result);
        if(result.length()<5){

        }
    }
}
