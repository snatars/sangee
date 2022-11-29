package eightpm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\DELL\\eclipse-workspace\\eightpm\\src\\eightpm\\mainfamily.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("Aarush");
	bw.newLine();
	bw.write("Anya");
	bw.newLine();
	bw.write("Sangee");
	bw.newLine();
	bw.write("Param");
	bw.close();
	
}
}
