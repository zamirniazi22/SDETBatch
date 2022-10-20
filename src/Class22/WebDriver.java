package Class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("perform the testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");

    }
}
class Chrome extends WebDriver {
    public void startBrowser() {
        System.out.println("Starting the Google Chrome");
    }

    public void test() {
        System.out.println("perform the testing opn Google Chrome");
    }

    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");

    }
}
class FirFox extends WebDriver{
    public void startBrowser() {
        System.out.println("Starting the FirFox");
    }

    public void test() {
        System.out.println("perform the testing opn FirFox");
    }

    public void closeBrowser() {
        System.out.println("Closing the FirFox");

    }

}
class Safari extends WebDriver {
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    public void test() {
        System.out.println("perform the testing opn Safari");
    }

    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}