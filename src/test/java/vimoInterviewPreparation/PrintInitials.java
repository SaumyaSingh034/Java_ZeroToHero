package vimoInterviewPreparation;

public class PrintInitials {
    public static void main(String[] args){
        String str = "Rahul Singh Bist";
        System.out.println(printOnlyInitials(str));
    }
    private static String printOnlyInitials(String str){
        String[] words = str.split(" ");
        StringBuffer sb = new StringBuffer();
        String fName, mName;
        for(int i=0;i< words.length-1;i++){
            fName = words[i].substring(0,1).toUpperCase();
            sb.append(fName+". ");
        }
        String lName = words[words.length-1];
        sb.append(lName.substring(0,1).toUpperCase()).append(
                lName.substring(1).toLowerCase()
        ).append(" ");
        return sb.toString();
    }

}
