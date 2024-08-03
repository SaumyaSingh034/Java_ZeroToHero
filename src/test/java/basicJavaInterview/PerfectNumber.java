package basicJavaInterview;

public class PerfectNumber {

    public static void main(String[] args){
        int number = 6;
        int i=1, sum=0;
        while(i<number) {
            if(number % i == 0){
                sum = sum + i;
            }
            i++;
        }
        if(sum == number){
            System.out.println(i+" is a perfect Number");
        }
        else{
            System.out.println(i+" is not a perfect Number");
        }
    }
}
