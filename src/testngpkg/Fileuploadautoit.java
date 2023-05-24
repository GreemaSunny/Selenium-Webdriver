package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
		@Test
		public void fileuploadpgm() throws IOException, Exception  {
			driver.get(" https://www.ilovepdf.com/pdf_to_word");
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\autoit code gree\\code.exe");
			Thread.sleep(3000);
		}
}
