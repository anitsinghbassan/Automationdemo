package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	
	private static Day2 myobj;
	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhuri Yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			
			driver = new ChromeDriver();
		} catch (Exception e) {
			getcommands();
			e.printStackTrace();
		}
		
	}
	
	public void getcommands() {
		
		try {
			driver.get("https://www.amazon.com/");
			String titleofthepage = driver.getTitle();
			System.out.println("Title Of The Page is: +titleofthepage");
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The Current URL Is: +currentUrl");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		Day2 myObj = new Day2();
		myobj.invokeBrowser();
		

	}

}
