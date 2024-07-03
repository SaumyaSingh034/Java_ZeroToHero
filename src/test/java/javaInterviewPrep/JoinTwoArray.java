package javaInterviewPrep;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArray {

    public static void main(String[] args) {
        String[] batsMen = {
                "Rohit",
                "Virat",
                "Dhoni",
                "Rishabh",
                "Shubham",
                "Axchar Patel"

        };

        String[] bowler = {
                "Arshdeep",
                "Hardik",
                "Jaddu",
                "Siraj",
                "Bum Bum Bumrah"
        };

        Stream<String> sbat = Arrays.stream(batsMen);
        Stream<String> sBowl = Arrays.stream(bowler);
        String fullteam[] = Stream.concat(sbat, sBowl).toArray(size -> new String[size]);
        for (String s : fullteam) {
            System.out.println(s);
        }
    }
}
