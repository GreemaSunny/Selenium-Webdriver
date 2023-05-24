package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

		String exptitle="facebook.com";
		String actualtitle=driver.getTitle();//Facebook- log in or sign up
		System.out.println(actualtitle);
		
		if(exptitle.equals(actualtitle))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
