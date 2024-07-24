package hackerRank;

public class SubstringComparison {

    public static void main(String[] args){
        String s = "welcometojava";
        int k = 3;
        getSmallestandLargest(s,k);

    }

    private static void getSmallestandLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0,k);

    }
}
