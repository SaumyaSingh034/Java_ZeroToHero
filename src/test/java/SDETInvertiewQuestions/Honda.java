package SDETInvertiewQuestions;

public class Honda extends Car{

    public void print(){
        System.out.println("print subclass");
    }

    public static void main(String[] args){
        Car c = new Honda(); //upcasting
        c.print();
    }
}
