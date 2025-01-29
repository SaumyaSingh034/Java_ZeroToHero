package patterns;

public class AlphabetPattern {

    public static void main(String[] args){
        int a = 65;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (a+i)+" ");
            }
            System.out.println();
        }

        System.out.println("******************************");
        int b = 65;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (a+i)+" ");
            }
            System.out.println();
        }
    }
}
