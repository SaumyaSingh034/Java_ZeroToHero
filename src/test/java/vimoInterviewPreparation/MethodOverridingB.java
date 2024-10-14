package vimoInterviewPreparation;

public class MethodOverridingB extends MethodOverridingA{
    public void display(){
        System.out.println("Display-B")
        ;
    }
    public static void main(String[] args){
        MethodOverridingA a = new MethodOverridingB();
        a.display();
        a.test();
    }
}
