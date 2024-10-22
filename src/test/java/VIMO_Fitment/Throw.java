package VIMO_Fitment;

public class Throw {
    public static void main(String[] args){
        int num = 9;
        if(num<1){
            throw new RuntimeException("Number is negative");
        }else{
            System.out.println("num: "+num);
        }
    }
}
