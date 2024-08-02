package JavaInterviewQuestions;

public class B extends A{

    public void display(int x, int y){
        System.out.println("---- Inside B --------");
        displayData(x, y);
    }

    public static void main(String[] args){
        B b = new B();
        b.display(5,8);
    }
}
