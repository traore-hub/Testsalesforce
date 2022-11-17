package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import utils.ConfigFile;

import java.util.concurrent.TimeUnit;

public class BrowserHelper {
public  static WebDriver driver;
    public static void helperbrowserChrome(){


        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.navigate().to(ConfigFile.property.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(ConfigFile.property.getProperty("login"));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ConfigFile.property.getProperty("password"));
        driver.findElement(By.xpath("//input[@id='Login']")).click();

    }

    public static void helperbrowserfirefox(){
        WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.navigate().to(ConfigFile.property.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(ConfigFile.property.getProperty("login"));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ConfigFile.property.getProperty("password"));
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    public static void helperbrowseredge(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.navigate().to(ConfigFile.property.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(ConfigFile.property.getProperty("login"));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ConfigFile.property.getProperty("password"));
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    public static void helperbrowserclose(){
        driver.close();
        driver.quit();
    }

    public static void clickOnElement(WebDriver driver, WebElement element) throws Exception {
        try {
            new Actions(driver).moveToElement(element).perform();
            element.click();
        } catch (Exception notInScreen) {
            try {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                element.click();
            } catch (Exception mouseClick) {
                try {
                    if (!element.getTagName().equals("button")) {
                        throw new Exception();
                    }
                    element.sendKeys(Keys.RETURN);
                } catch (Exception enterClick) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                }
            }
        }
        Thread.sleep(1000);
    }


}
