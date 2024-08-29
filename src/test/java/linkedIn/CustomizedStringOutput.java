package linkedIn;

public class CustomizedStringOutput {

    public static void main(String[] args){
        String str = "Go to Joho";
        StringBuffer sb =  new StringBuffer();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='o'){
                count++;
                for(int j=0;j<count;j++)
                    sb.append('$');
            }
            else
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
