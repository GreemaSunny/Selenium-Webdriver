package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {
	
@Parameters("s")
@Test
public void main(String s)
{
	System.out.println("value="+s);
}
}
