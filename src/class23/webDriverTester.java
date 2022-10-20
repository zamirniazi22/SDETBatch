package class23;



public interface webDriverTester {
    public static void main(String[] args) {
        WebDriver[]Browsers={new ChromeDriver(),new FirfoxDriver()};
        for(WebDriver web :Browsers){
            web.OpenBrowser();
            web.CloseBrowser();
            web.MaximizeWindow();
            web.FindElement();


        }


    }
}
