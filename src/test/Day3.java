package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	
	
WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhuri Yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			navigateCommands();
			
			driver = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void navigateCommands() {
		try {
			driver.navigate().to("https://www.flipkart.com/");
			driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[2]/a/span')]")).click();
			driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[2]/ul/li/ul/li[2]/ul/li[3]/a/span")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		Day3 myObj = new Day3();
		myObj.invokeBrowser();
		
		

	}

}
