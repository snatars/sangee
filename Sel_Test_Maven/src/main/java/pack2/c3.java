package pack2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="two")
	public void Test3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.google.com");
		
		Actions a = new Actions(cd);
		WebElement we = cd.findElementByName("q");
		a.click(we).keyDown(Keys.SHIFT).sendKeys("selenium").sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
		cd.quit();
	}

}
