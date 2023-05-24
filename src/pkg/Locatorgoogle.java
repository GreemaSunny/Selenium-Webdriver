package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorgoogle {

	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googlesearch() {
	driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
	//driver.findElement(By.name("btnK")).click(); will not work as suggestions will be coming once we search
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
}
