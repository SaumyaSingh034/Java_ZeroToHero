package linkedIn;

public class CleanedAccountNumber {
    public static void main(String[] args){
        String number = "123-456-789";
        String result = number.replaceAll("[^0-9]","");
        if(result.length() == 9){
            System.out.println( result);
        }else{
            System.out.println("Account Number is invalid");
        }



    }
}
