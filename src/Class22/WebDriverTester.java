package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
       /* Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FirFox firFox=new FirFox();
        firFox.startBrowser();
        firFox.test();
        firFox.closeBrowser();*/

        WebDriver[]browsers={new Chrome(),new FirFox(),new FirFox()};
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

    }
}
