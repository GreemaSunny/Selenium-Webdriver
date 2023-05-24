package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browsernotificationdisable {
	WebDriver d;
	@BeforeTest
	public void setup() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		d=new ChromeDriver(options);
		d.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		d.get("https://www.justdial.com");
	}
	
	public void clearbrowsingdata() throws Exception {
		d.manage().deleteAllCookies();
		d.get("chrome://settings//clearBrowerData");
		d.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		Thread.sleep(7000);
	}
}
