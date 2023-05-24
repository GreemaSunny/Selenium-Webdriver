package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon {

	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void testing() {
		driver.findElement(By.xpath("//*[@class='nav-search-field ']/input")).sendKeys("mobile",Keys.ENTER);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']/input[1]")).sendKeys("absu@gmail.com");
		driver.findElement(By.xpath("//span[@class='a-button-inner']/input")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/i")).click();
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
}




