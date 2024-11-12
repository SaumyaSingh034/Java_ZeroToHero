package November;

public class WebDriverManager {

    private static WebDriverManager driverManager;

    private WebDriverManager(){

    }

    public static WebDriverManager getDriverManager(){
        if(driverManager==null){
            driverManager = new WebDriverManager();
        }
        return driverManager;
    }
}
