import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrayToStrings {

    public static void main(String[] args)
    {
        String[] arr = {"t","r","v"};

        //1. Using String join method
        String join  = String.join(";",arr);
        System.out.println(join);

        //2. Using Streams
        String join2 = Arrays.asList("t","r","y","i","n","g")
                .stream().collect(Collectors.joining("@"));

        String joinInteger = Arrays.asList(1,2,3,4,5,6,7,8,9)
                .stream().map(e->String.valueOf(e)).collect(Collectors.joining(";"));

        System.out.println(join2);
        System.out.println(joinInteger);
        System.out.println(joinString("**",arr)); //t**r**v**
        System.out.println(joinInt("||",1,2,3,4,5,6));
    }

    public static String joinString(String separator, String... arr){
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(String s : arr){
            if(s!=null){
                sb.append(s);
                len = sb.length();
                sb.append(separator);
            }
        }
        return sb.substring(0,len);
    }

    public static String joinInt(String separator, Integer... arr){
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(Integer s : arr){
            if(s!=null){
                sb.append(s);
                len = sb.length();
                sb.append(separator);
            }
        }
        return sb.substring(0,len);
    }
}
