package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {
	
	@Test(groups="one")
	public void Test2() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		File f1 = cd.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("C:\\Users\\DELL\\eclipse-workspace\\Sel_Test_Maven\\screen_shot\\y.png"));
		cd.quit();
	}

}
