package review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplication {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        //1. Open the Browser
        System.setProperty("webdriver.chrome.driver", "/Users/ridvancadiroglu/Desktop/MyProject/LearningSeleniumBasics");
        driver.get("https://www.google.com/");
    }
}
