package January2025;

public class ChildOverriding extends ParentOverriding{

    public void privateMethod(){
        System.out.println("Hi I am Private");
    }

    @Override
    public void defaultMethod() { // Changed to public
        System.out.println("Child Default Method");
    }

    @Override
    public void protectedMethod() { // Same as parent or more permissive
        System.out.println("Child Protected Method");
    }

    @Override
    public void publicMethod() { // Must remain public
        System.out.println("Child Public Method");
    }


}
