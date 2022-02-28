
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_DURGA SOFT_SELENIUM CLASS FILES\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.close();
	driver.quit();

	}

}
