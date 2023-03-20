package review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserClose {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

//  ChromeOptions options = new ChromeOptions();
//  options.addArguments("--remote-allow-origins=*");

        driver.get("https://www.facebook.com/");
        driver.close();


    }
}
