package using_autoit;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test
	public void m1() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		ob.findElementByCssSelector("#addBtn").click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\DELL\\qtree\\autoitfile_san.exe");

		
	}

}
