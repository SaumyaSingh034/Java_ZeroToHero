package December2024Prep;

import java.util.Scanner;

public class CountNumberOfWordsDynamically {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String str = sc.nextLine();
        sc.close();
        countWords(str);

    }

    private static void countWords(String str) {
        String words[] = str.trim().split("\\s+");
        int count=0;
        for(String w : words){
            if(!w.isEmpty())
                count++;
        }
        System.out.println(count);
    }
}
