package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@ Test
	public void linkcount() {
		List <WebElement> Li=driver.findElements(By.tagName("a"));
		System.out.println("Total link count= "+Li.size());
		List <WebElement> fo=driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li"));
		System.out.println("Total footer link count= "+fo.size());
		
		
	}
	@After
	public void teardown() {
		driver.quit();
	}
}
