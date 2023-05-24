package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaffairscloud {

	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.affairscloud.com");
	}
	
	@Test
	public void testingibps() {
		driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children td-menu-item td-normal-menu menu-item-154757']/a")).click();
	}
	
	
	
	@After
	public void teardown() {
		driver.quit();
	}
}
