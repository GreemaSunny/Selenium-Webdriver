package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobotpgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
		@Test
		public void fileuploadpgm() throws Exception  {
			driver.get(" https://www.ilovepdf.com/pdf_to_word");
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
			
			fileUpload("E:\\gr.doc\\B.TECH\\journals\\Jay.pdf");
		}

		public void fileUpload(String p) throws AWTException {
			StringSelection strSelection = new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
			
			Robot robot=new Robot();
			
			robot.delay(4000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(4000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		
		}
		
}
