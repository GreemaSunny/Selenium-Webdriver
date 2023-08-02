package pkg;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {
@Test
	public void test() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

		String exptitle="Facebook – log in or sign up";
		String actualtitle=driver.getTitle();//Facebook- log in or sign up
		System.out.println(actualtitle);
		
		if(exptitle.equals(actualtitle))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		Assert.assertEquals(actualtitle, exptitle);
		}

}
