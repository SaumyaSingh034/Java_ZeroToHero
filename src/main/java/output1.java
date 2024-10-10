import java.util.ArrayList;
import java.util.Arrays;

public class output1 {

    public static void main(String[] args){
        //static int a = 10;
       /* int b = a+10;
        System.out.println(b);*/

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.removeAll(new ArrayList<>(Arrays.asList(1, 3, 4, 5)));
        System.out.println(a);
    }
}
