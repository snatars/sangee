package eightpm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
	
	public static void main (String[] args) throws IOException
	{
	
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\eightpm\\src\\eightpm\\name");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		while ((line=br.readLine())!=null)				
		{
			
				System.out.println(line);
		}
		
	}

}
