package class23;

public interface WebDriver {

   // Create a WebDriver Interface that will have the following unimplemented behaviour:
    //openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

     void OpenBrowser();
     void CloseBrowser();
     void MaximizeWindow();
     void FindElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void OpenBrowser() {
        System.out.println("to open chromeBrowser Right-click on the shortcut you use for Chrome");

    }

    @Override
    public void CloseBrowser() {
        System.out.println("to shut ChromeBrowser page click on close button ");

    }

    @Override
    public void MaximizeWindow() {
        System.out.println("to maximize ChromeBrowser page click on maximize button");
    }

    @Override
    public void FindElement() {
        System.out.println( "to find element in chromeBrowser  press F12 on Windows");
    }
}
class FirfoxDriver implements WebDriver{

    @Override
    public void OpenBrowser() {
        System.out.println("to open FirFoxBrowser Right-click on the shortcut you use for FirFox");

    }

    @Override
    public void CloseBrowser() {
        System.out.println("to shut FirFoxBrowser page click on close button ");
    }

    @Override
    public void MaximizeWindow() {
        System.out.println("to maximize FirFoxBrowser page click on maximize button");
    }

    @Override
    public void FindElement() {
        System.out.println( "to find element in FirFoxBrowser  press F7 on Windows");
    }
}
