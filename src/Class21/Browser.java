package Class21;

import javax.management.MBeanAttributeInfo;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
   void navigate(){
       System.out.println("opening the url");
   }
   void test(){
       System.out.println("Testing the webpage");
   }
   void closeBrowser(){
       System.out.println("closing the Browser");
   }

}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("opening hte Browser in less than 1 sec");
    }
}
class Firfox extends Browser{
    void openBrowser(){
        System.out.println("opening hte Browser in less than 2 sec");
    }

    public static void main(String[] args) {
        Chrome chrome =new Chrome();
        chrome.openBrowser();
        chrome.closeBrowser();
        chrome.navigate();

    }
}

