import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid02 {

    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.10:4444"), new EdgeOptions());
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
    }
}
