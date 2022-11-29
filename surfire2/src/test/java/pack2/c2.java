package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		cd.quit();
	}
}
