package linkedIn;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args){
        int number = 5;
        printFact(5);
        printFact(-5);

    }

    public static void printFact(int number){
        if(number<0)
            System.out.println(0);
        BigInteger fact = new BigInteger("1");
        for(int i=1;i<=number;i++){
            fact = fact.multiply(new BigInteger(i+ ""));
        }
        System.out.println(fact.toString());
    }
}
