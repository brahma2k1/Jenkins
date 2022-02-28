package org.selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class prog2 {
   public static void main(String[] args) throws Exception {
	  WebDriverManager.chromedriver().setup();
	//  driver = new ChromeDriver();
   //   System.setProperty("webdriver.chrome.driver", "E:\\DURGA_WORK SPACE\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      // maximizing browser with maximize()
      driver.manage().window().maximize();
      Thread.sleep(3000);
  //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.partialLinkText("Coding")).click();
   //   driver.close();
      driver.quit();
   }
}
