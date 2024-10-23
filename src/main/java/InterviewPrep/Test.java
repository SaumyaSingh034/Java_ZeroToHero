package InterviewPrep;

public class Test extends C{
    @Override
    public void m1() {
        System.out.println("m1");

    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m4() {
        System.out.println("m4");
    }

    @Override
    void m6() {
        System.out.println("m6");
    }
    public void m7(){
        System.out.println("m7");
    }

    public static void main(String[] args){
        Test t1 = new Test();
        t1.m1();
        t1.m2();
        t1.m4();
        t1.m5();
        t1.m6();
        t1.m7();

        C c = new Test();
        System.out.println("reating variable for Abstract Class");
        c.m1();
        c.m2();
        c.m4();
        c.m5();
        c.m6();

        B b = new Test();
        System.out.println("reating variable for Interface Class InterviewPrep.B");
        b.m1();
        b.m2();
        b.m4();

        A a = new Test();
        System.out.println("reating variable for Interface Class InterviewPrep.A");
        a.m1();
        a.m2();
        A.m3();
        System.out.println(A.x);


    }
}
