package JavaInterviewQuestions;

public class A {
    int a , b;
    public void displayData(int x, int y){
        a = x;
        b = y;
        System.out.println("---------- Inside Class A -------");
        System.out.println("Value of A: "+a+" Value of B: "+b);
    }

    public void displayData(int x, int y,int z){
        System.out.println("Sum of the data inside block A: "+(x+y+z));
    }

    public void print(){
        System.out.println("Hello Class A");
    }
}
