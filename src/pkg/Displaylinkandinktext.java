package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displaylinkandinktext {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@ Test
	public void linkdisplay() {
		
		List <WebElement> Li=driver.findElements(By.tagName("a"));
		
		for(WebElement E:Li) {
			
			String url=E.getAttribute("href");
			System.out.println(url+"---"+E.getText());
			
		}
	}
}
