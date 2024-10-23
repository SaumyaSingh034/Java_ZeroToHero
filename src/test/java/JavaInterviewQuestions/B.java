package JavaInterviewQuestions;

public class B extends A{

    public void display(int x, int y){
        System.out.println("---- Inside InterviewPrep.B --------");
        displayData(x, y);
    }
    public void print(){
        System.out.println("Hello Class InterviewPrep.B");
    }

    public static void main(String[] args){
//        InterviewPrep.B b = new InterviewPrep.B();
//        b.display(5,8);
        A a = new A();
        a.displayData(5,6,7);
        a.displayData(7,7);
        B b = new B();
        b.print();
    }
}
