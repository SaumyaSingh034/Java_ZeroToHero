package LinkedInJavaProblems;

public class ErrorHandeling {

    public static void main(String[] args){
        try{
            int a = 10/0;
            System.out.println("This statement will not be executed");
        }catch (Exception e){
            System.out.println("Exception Block");
        }finally {
            System.out.println("Finally Block");
        }
    }
}
