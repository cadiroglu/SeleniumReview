package review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CaptureTitle {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com/"); // Chrome
        driver.navigate().to("https://www.facebook.com/");

        String pageTitle=driver.getTitle();
        System.out.println("The title of the page is : " + pageTitle);



    }
}