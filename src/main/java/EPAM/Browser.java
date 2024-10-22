package EPAM;

public class Browser {
    private static Browser browser;

    private Browser(){

    }

    public Browser getInstance(){
        browser = new Browser();
        return browser;
    }

}
