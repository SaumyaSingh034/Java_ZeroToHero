package LinkedInJavaProblems;

public class StringConcept {
    public static void main(String[] args){
        String s1 = new String("xyz");
        String s2 = "xyz";
        String s3 = "xyz"; //s2==s3 will true
        System.out.println(s1==s2);
        System.out.println(s1.intern()==s2);
    }
}
