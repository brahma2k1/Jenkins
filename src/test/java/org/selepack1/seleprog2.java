package org.selepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleprog2 extends seleprog1 {
		
		int a,b,c;
		
		public void m3(int a,int b)
		{
			c=a+b;
			System.out.println("The addition of c is:"+c);
		}
		public void m4(int a, int b)
		{
			c=a-b;
			System.out.println("The subtraction of c is:"+c);
		}
		public static void main(String[] args) {
			
			seleprog2 obj1=new seleprog2();
			obj1.m3(30,40);
			obj1.m4(30,20);
			obj1.m1(20);
			obj1.m2(40,30);	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("hello");
			driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	//		Thread.sleep(3000);
			//.quit();

		}

	}


