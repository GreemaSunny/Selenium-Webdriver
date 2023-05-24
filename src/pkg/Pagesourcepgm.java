package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String src=driver.getPageSource();//return sourcecode
		
		if(src.contains("Password") ) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
	}

}
