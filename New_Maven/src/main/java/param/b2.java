package param;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class b2 {
	/*@Parameters({"VUSER","VPASS"})
	@Test
	public void f1(String u,String p)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		cd.findElementById("user").sendKeys(u);
		cd.findElementByName("pass").sendKeys(p);
	}*/
	@Parameters({"VUSER","VPASS"})
	@Test
	public void f1(String u,String p)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		cd.findElementById("user").sendKeys(u);
		cd.findElementByName("pass").sendKeys(p);
	}
	

}
