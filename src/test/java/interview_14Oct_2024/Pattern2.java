package interview_14Oct_2024;

public class Pattern2 {
    public static void main(String[] args){

        for(int i=0;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
           for(int k=1;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}
