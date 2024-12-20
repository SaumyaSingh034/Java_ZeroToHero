package PayPay;

import java.sql.PreparedStatement;

public class StringMaipulationBasedOnArray {
    public static void main(String[] args){
        int[] spaces = {1,5,7,9};
        String str = "icodeinpython";
        stringManipulation(str, spaces);
    }

    private static void stringManipulation(String str, int[] spaces) {
        StringBuffer sb = new StringBuffer(str);
        for(int i=spaces.length-1;i>=0;i--){
            int index=spaces[i];
            if(index<sb.length() && index>=0){
                sb.insert(index,' ');
            }
        }
        System.out.println(sb.toString());

    }
}
