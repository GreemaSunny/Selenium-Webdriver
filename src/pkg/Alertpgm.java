package pkg;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/webpage.html");
}
	@ Test
	public void buttontext() {
		driver.findElement(By.xpath("//html/body/input[1]")).click();
	                                                                         	//input[1]
	   Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		System.out.println(alerttext);
		driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("Greema");
		driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("123");
		driver.findElement(By.xpath("//html/body/input[4]")).click();
		}	
	}
	

