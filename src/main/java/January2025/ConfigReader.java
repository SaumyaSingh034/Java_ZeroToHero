package January2025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void main(String[] args){
        Properties prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/main/resources/data.properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("env"));

    }
}
