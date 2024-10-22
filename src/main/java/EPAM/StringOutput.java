package EPAM;

public class StringOutput {
    public static void main(String[] args){
        String s = "India is great";
        String[] word = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i].substring(0,1).toUpperCase()).append(word[i].substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.println(sb);
    }
}
