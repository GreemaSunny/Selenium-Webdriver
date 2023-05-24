package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurudemosite {
WebDriver driver;
	
	@BeforeTest
	public void setup(){
		driver=new ChromeDriver();	
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void gurusitetest() throws InterruptedException  {
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();
		Thread.sleep(1000);
		a.accept();
		
	}
}
