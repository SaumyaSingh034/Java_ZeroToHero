package SDET_RahulShetty;

public class PrimeNumber {
    public static void main(String[] args){
        int number = 7;
        if(number ==0 || number ==1){
            System.out.println("Not a prime Number");
        } else if (number==2) {
            System.out.println("prime Number");

        } else {
            for(int i=2;i<number/2;i++){
                if(number%i==0)
                    System.out.println("Not a Prime");
                else
                    System.out.println("Prime");
            }
        }
    }
}
