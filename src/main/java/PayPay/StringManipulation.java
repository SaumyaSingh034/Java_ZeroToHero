package PayPay;

public class StringManipulation {
    public static void main(String[] args){
        int[] spaces = {1,5,7,9};
        String str = "icodeinpython";
        stringDataManipulation(str, spaces);
    }

    private static void stringDataManipulation(String str, int[] spaces) {
        StringBuffer result = new StringBuffer(str);
        for(int i=spaces.length-1;i>=0;i--){
            int index = spaces[i];
            if(index<result.length() && index>=0)
                result.insert(index,' ');
        }
        System.out.println(result.toString());
    }
}
