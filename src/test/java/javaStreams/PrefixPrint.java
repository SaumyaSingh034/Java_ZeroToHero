package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixPrint {

    public static void main(String[] args){
        Integer[] number = {222,245,342,022,202,2,341,333,21,002,02,12,32,422,233};

        System.out.println(prefixPrintWithoutUsingJavaStreams(number, 2));
        System.out.println(prefixPrintWithUsingJavaStreams(number, 2));



    }

    private static List<Integer> prefixPrintWithUsingJavaStreams(Integer[] number, int i) {
        List<Integer> prefixList = Arrays.asList(number);
        List<Integer> data =  prefixList.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith(String.valueOf(i)))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        return data;
    }

    private static ArrayList<Integer> prefixPrintWithoutUsingJavaStreams(Integer[] number, int digit) {
        String num;
        ArrayList<Integer> prefixList = new ArrayList<>();
        for(int i =0;i<number.length;i++){
            num = String.valueOf(number[i]);
            if(num.startsWith(String.valueOf(digit))){
                prefixList.add(Integer.parseInt(num));
            }
        }
        return prefixList;
    }
}
