package SDETInvertiewQuestions;

public class Testing {

    public static String reverseString(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public static void fibonacciSeries(int number){
        int a = 0;
        int b=1;
        int temp=1;
        for(int i =1;i<=number;i++){
            System.out.print(a+" ");

            a = b;
            b = temp;
            temp = a+b;

        }
    }

    public static void main(String[] args){
        System.out.println(reverseString("Saumya"));
        fibonacciSeries(5);
    }
}
