package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareAverage {

    public static void main(String[] args){

        Integer[] number = {1,10,20,30,40,8,9,60};

       System.out.println("Value of Square Average without Java Stream is : "+squareAverageWithoutJavaStrems(number));
        System.out.println("Value of Square Average with Java Stream is : "+squareAverageWithJavaStreams(number));
    }

    private static double squareAverageWithJavaStreams(Integer[] number) {
        List<Integer> list = Arrays.asList(number);
        return list.stream()
                .map(e -> e * e)
                .filter(e-> e > 100)
                .mapToInt(e -> e).average().getAsDouble();




    }

    private static double squareAverageWithoutJavaStrems(Integer[] number) {

        int square;
        int sum = 0, count=0;
        double avg =0;
        for(int i=0;i<number.length;i++){
            square = number[i] * number[i];
            if(square > 100){
                sum += square;
                count++;
            }
        }
        return avg = sum/count;
    }
}
