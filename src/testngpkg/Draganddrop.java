package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get(" https://demoqa.com/droppable/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void drag() {
		
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragme, drophere);
		act.perform();
		
		//WebElement T=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/p"));
		
		String actual=drophere.getText();
		String exp="Dropped!";
		if(actual.equalsIgnoreCase(exp)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
}
