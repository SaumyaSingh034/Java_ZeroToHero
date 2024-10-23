package InterviewPrep;

public class StringImmutable {

    public static void main(String[] args){
        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.println(x);

        String s1 = "Animal";
        String s2 = "Animal";
        String s3 = new String("Animal");
        String s4 = new String("Animal");
        s3.concat(s4);
        System.out.println(s3);

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s3);

        //InterviewPrep.SystemOUTPrintLn.test.print();
    }
}
