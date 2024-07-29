package javaSessionsNaveen;

public class CallByRef {
    String name;
    int age;

    public static void main(String[] args){
        CallByRef obj =  new CallByRef();
        obj.name = "Rahul";
        obj.age = 32;

        System.out.println(obj.name);
        System.out.println(obj.age);
        CallByRef.test(obj);
        System.out.println(obj.age);

        CallByRef t2 = new CallByRef();
        System.out.println(t2.age);
        CallByRef.test(t2);
    }

    public static void test(CallByRef t1){
        System.out.println("Under Test Method");
        System.out.println(t1.name);
        System.out.println(t1.age);

        t1. age=50;

    }
}
