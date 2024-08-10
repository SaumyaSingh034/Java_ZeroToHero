package SDETInvertiewQuestions;

public class SwapTwoString {
    public static void main(String[] args){
        String s1 = "Singh";
        String s2 = "Saumya";

        System.out.println("Before Swapping");
        System.out.println(s1+" "+s2);
        String temp;
        temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("After Swapping");
        System.out.println(s1+" "+s2);
    }
}
