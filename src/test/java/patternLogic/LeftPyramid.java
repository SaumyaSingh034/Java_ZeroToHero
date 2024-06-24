package patternLogic;

public class LeftPyramid {

    public static void main(String[] args){

        for(int i=0;i<5;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int l=0;l<5;l++){
            for(int k=5;k>l;k--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
