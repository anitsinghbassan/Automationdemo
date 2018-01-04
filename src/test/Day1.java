package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	WebDriver driver;
	
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhuri Yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.com/");
			findgym();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void findgym() {
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 8");
			Thread.sleep(3000);
			driver.findElement(By.className("nav-input")).click();
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,500)");
			
			driver.findElement(By.name("s-ref-checkbox-Apple")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Day1 myobj = new Day1();
		myobj.invokeBrowser();
	}

}
