package javaInterviewPrep;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

    public static void main(String[] args){

        try {
            System.out.println(new URL("https://www.facebook.com/").equals(new URL("https://2a03:2880:f131:83:face:b00c:0:25de")));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
