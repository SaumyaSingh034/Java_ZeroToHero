package IMP_InterviewQuestions;

public class Question4 {

    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
       // str1 = str1+str3;
        //How many object will be created

        //My answer: 3 --> str1/str2 = hello  str3=world str1 = helloword
        System.out.println(str1==str2);
        System.out.println(str1==str3);
//        System.out.println(str==str3);
    }
}
