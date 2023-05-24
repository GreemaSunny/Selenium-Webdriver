package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownrediff {

	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
	@ Test
	public void dropdown() {
		
		WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select dayelement=new Select(day);
		dayelement.selectByValue("01");
			
	    WebElement month=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	    Select monthelement=new Select(month);
	    monthelement.selectByVisibleText(" FEB");
	    List <WebElement> monthlist=monthelement.getOptions();
		System.out.println("monthcount= "+monthlist.size());
	    
       for(WebElement E:monthlist) {
			
		  //String m=E.getAttribute("value");
			System.out.println(E.getText());
			
		}
	    
	    WebElement year=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	    Select yearelement=new Select(year);
	    yearelement.selectByIndex(5);
	    
	    //logo
	    
	    WebElement logo=driver.findElement(By.xpath("//form[@name='register_mail']/div/table[1]/tbody/tr/td/img"));
	    if(logo.isDisplayed()) {
	    	System.out.println("Logi is present");
	    }
	    else {
	    	System.out.println("Logo is not present");
	    	}
	    }
	}
		
		

