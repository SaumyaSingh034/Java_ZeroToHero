package SDETInvertiewQuestions;

public class LinkedIn1 {
    public static void main(String[] args){
        String s1 = "Go to Joho";
        //output = G$ t$$ J$$$h$$$$$
        System.out.println(printStringWithGivenFormat(s1,"$","o"));
        System.out.println(customString(s1,"$","o"));
        System.out.println(test(s1));
    }

    public static String customizeString(String s, String specialchar, String chartobereplace) {
        String arr=s;
        int len=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length();i++) {
            if(Character.toString(arr.charAt(i)).equals(chartobereplace)) {
                len++;
                for(int j=0;j<len;j++) {
                    sb.append(specialchar);
                }
            }
            else {
                sb.append(arr.charAt(i));
            }
        }
        return sb.toString();

    }


    private static String printStringWithGivenFormat(String s, String specialChar, String charToreplace) {
        String arr = s;
        int length = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length();i++){
            if(Character.toString(arr.charAt(i)).equalsIgnoreCase(charToreplace)){
                length++;
                for(int j =0;j<length;j++){
                    sb.append(specialChar);
                }

            }else {
                sb.append(arr.charAt(i));
            }
        }
        return sb.toString();

        }
        public static String test(String s1){
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='o'){
                count++;
                for(int j=1;j<=count;j++){
                    sb.append("$");
                }
            } else{
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
        }


        private static String customString(String str, String special, String oldChar){
        int length = 0;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.toString(str.charAt(i)).equalsIgnoreCase(oldChar)){
                length++;
                for(int j=0;j<length;j++){
                    sb.append(special);
                }
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        }

}
