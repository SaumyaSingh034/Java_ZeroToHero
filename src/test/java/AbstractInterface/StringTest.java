package AbstractInterface;

public class StringTest {

    private static void test(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        StringBuffer sb = new StringBuffer();
        int sum;
        int a;
        int b;
        for (int i = 0; i < c2.length; i++) {
            for (int j = 0; j < c1.length; j++) {
                a = Integer.parseInt(String.valueOf(c1[j]));
                b = Integer.parseInt(String.valueOf(c2[i]));
                i++;
                sum = a + b;
                sb.append(sum);
            }
            break;

        }
        for (int i = c1.length; i < c2.length; i++) {
            sb.append(c2[i]);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s = "123";
        String s1 = "8643556";
        test(s, s1);

    }
}


