package BrightlySoftware.FinalRound;

public class PrimNumber {
    public static void main(String[] args){
        int n = 9;
        if(n==0 || n== 1)
            System.out.println(false);
      for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0) {
              System.out.println(false);
          }
      }
      System.out.println(true);
    }
}
