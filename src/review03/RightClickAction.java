package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClickBtn =driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act = new Actions(driver);
        act.contextClick(rightClickBtn).perform();

    }
}
