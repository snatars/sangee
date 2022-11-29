package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {
	public static void main(String[] args) throws IOException{
		
	
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		File f = cd.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\DELL\\eclipse-workspace\\Sel_Test_Maven\\screen_shot\\x.png"));
		
	}

}
