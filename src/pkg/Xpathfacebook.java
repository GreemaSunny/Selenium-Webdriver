package pkg;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfacebook {
	ChromeDriver driver;
	@Before
	
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void facebooklogin() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcgh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
}
