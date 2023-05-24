package test;

import org.testng.annotations.Test;
import page.Fbloginpage;
import utilities.Excelutils;

public class Fblogintestdatadriven extends Baseclass{

	@Test
	public void verifyLoginwithValidCred() throws Exception
 {
		Fbloginpage p1=new Fbloginpage(driver);
		
		String xl="C:\\Users\\HP\\Desktop\\exceldata_driven\\Book1.xlsx";
		String Sheet="LoginSheet";
		int rowCount=Excelutils.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++) {
			
			String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("username="+UserName);
			
			String Pswd=Excelutils.getCellValue(xl, Sheet, i, 1);
			System.out.println("password="+Pswd);
			
			p1.setvalues(UserName, Pswd);
			p1.login();
			driver.navigate().refresh();
			
			String expectedurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgzMzQ1NTIwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
			  String actualurl= driver.getCurrentUrl();
			  
			     if(actualurl.equals(expectedurl))
			     {
			    	System.out.println("pass");
			     }else
			     {
			    	System.out.println("fail");
			     }
		}
	}
}
