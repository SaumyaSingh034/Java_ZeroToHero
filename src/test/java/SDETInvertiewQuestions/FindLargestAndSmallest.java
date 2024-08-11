package SDETInvertiewQuestions;

public class FindLargestAndSmallest {

    public static void main(String[] args){
        String s = "Java is the best programming Language";
        String[] word = s.trim().replaceAll("\\s+"," ").split(" ");
        String shortest = word[0];
        String largest = word[0];
        for(String w : word){
            if(shortest.length()>w.length())
                shortest = w;
            if(largest.length()<w.length())
                largest = w;

        }
        System.out.println("Shortest: "+shortest+" Largest: "+largest);
    }
}
