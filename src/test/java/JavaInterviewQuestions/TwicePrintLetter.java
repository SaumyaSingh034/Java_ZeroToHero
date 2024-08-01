package JavaInterviewQuestions;

public class TwicePrintLetter {

    public static void main(String[] args) {
        String data = "hello   ";
        String dataNew = "";
        //output = hheelllloo
        for(int i = 0;i<data.length();i++){
            for(int j=1;j<=2;j++)
                dataNew = dataNew+data.charAt(i);
        }
        System.out.println(dataNew);
    }
}
