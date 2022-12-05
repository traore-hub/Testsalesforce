package common;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserhelper {

	public static WebDriver driver;

	public static void openBrowserInMaxWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void navigate(WebDriver driver, String URl) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URl);
	}

	public static WebDriver initializeDriver(WebDriver driver) throws Exception {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications"); // disable popup notification
		//System.setProperty("webdriver.chrome.driver", Utils.getProperty("TestDriverPath"));
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return (driver);
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
	public static void checkAuthentication(WebDriver driver) {
		String currentPath = driver.getCurrentUrl();
		assertEquals("Logged in : true", "Logged in : " + !currentPath.contains("cas/login"));
	}

}
