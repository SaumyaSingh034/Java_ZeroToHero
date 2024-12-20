package December2024Prep;

public class Fibonnaci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int sum;
        for(int i=0;i<10;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b=sum;
        }
    }
}
