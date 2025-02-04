package IMP_InterviewQuestions;

public class Question7 {
    public static void main(String[] args){
        //Pay Pay Interview
        String str = "icodeinpython";
        int[] space = {1,5,7,9};

        /*
        insert space in string at the same index
         */
        customizeStringBasedOnArray(str, space);

    }

    private static void customizeStringBasedOnArray(String str, int[] space) {
        StringBuffer result = new StringBuffer(str);
        for(int i=0;i<space.length;i++){
            result.insert(space[i],' ');
        }
        System.out.println(result.toString());
    }
}
