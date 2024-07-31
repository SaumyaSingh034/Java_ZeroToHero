package JavaInterviewQuestions;

import java.util.stream.IntStream;

public class FactorialNumberJavaStreams {

    public static void main(String[] args){
        System.out.println(isFactorial(5));
    }

    private static int isFactorial(int i) {
        return IntStream.rangeClosed(2,i).reduce(1, (x,y) -> x*y);
    }
}
