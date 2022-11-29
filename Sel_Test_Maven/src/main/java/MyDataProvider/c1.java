package MyDataProvider;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class c1 {
	
	@DataProvider(name="sangeetha")
	public Object[][] method1()
	{
		Object[][] obj = {
				{"abc","123"},
				{"def","456"},
				{"ghi","789"}
		};
		return obj;
		
	}
 
	@Test(dataProvider="sangeetha")
	public void dataset(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		cd.findElementById("user").sendKeys(username);
		cd.findElementById("pass").sendKeys(password);
		Thread.sleep(2000);
		cd.quit();
	}
}
