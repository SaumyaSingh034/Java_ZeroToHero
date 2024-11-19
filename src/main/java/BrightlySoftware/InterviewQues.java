package BrightlySoftware;

public class InterviewQues {
    static int i = 10;
    int j = 77;

    public static void main(String[] args) {

        int i = 111; //
        System.out.println("hello"); //hello

        InterviewQues t1 = new InterviewQues();
        InterviewQues t2 = new InterviewQues();
        System.out.println("object i" + t1.i);// object i10
        System.out.println("object j" + t1.j); //object j77
        ++t1.i;
        ++t1.j;
        System.out.println(InterviewQues.i); //11
        System.out.println("Simple without object" + i); //111
        System.out.println("object i" + t2.i); //11
        System.out.println("object j" + t2.j);//77
        //System.out.println(InterviewQues.j);

    }
}
