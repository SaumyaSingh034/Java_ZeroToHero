package JSON_Jackson;

public class Prime {

    public static void main(String[] args){
        int year = 2004;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year "+year);
                }
                System.out.println("Not a Leap Year ");
            }
            System.out.println("Leap Year "+year);
        }
    }
}