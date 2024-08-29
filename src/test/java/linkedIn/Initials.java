package linkedIn;

public class Initials {
    public static void main(String[] args){
        String str = "rahul singh bist";
       System.out.println( printInitialsInCaps(str));
       System.out.println( printInitialsInCaps("tryaksh singh bist"));
      printOnlyInitials("tryaksh singh bist");
      printOnlyInitials("devashish kumar gupta");
    }

    private static String printInitialsInCaps(String str) {
        String[] word = str.split(" ");
        StringBuffer result = new StringBuffer();
        for(String w : word){
            String first = w.substring(0,1).toUpperCase();
            String rest = w.substring(1);
            result.append(first+rest+" ");
        }
        return result.toString();
    }


    public static void printOnlyInitials(String str)
    {
        String[] words = str.split("\\s");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i< words.length-1;i++){ //Rahul
            String initial = words[i].substring(0,1).toUpperCase(); //R
            String rest = ".";
            sb.append(initial+rest+" ");
        }
        String surname = words[words.length-1].substring(0,1).toUpperCase();
        String rest = words[words.length-1].substring(1);
        sb.append(surname+rest);
        System.out.println(sb);
    }
}
