package hackerRank;

public class SwapTwoString {

    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = " World";
        System.out.println("Before swapping : "+s1+s2);
        s1 = s1+s2; //s1 = HelloWorld
        s2 = s1.substring(0,s1.length()-s2.length()); //8-4 4//Hello
        s1 = s1.substring(s2.length());

        System.out.println("After swapping : "+s1+s2);

    }
}
