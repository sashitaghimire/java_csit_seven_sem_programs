package simple_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileData {
	
	public static void main(String[] args) {
		try {
//			FileReader reader = new FileReader("/home/ishwor/Documents/Java Text/read.txt");
			FileInputStream  fileInputStream = new FileInputStream("/home/ishwor/Documents/Java Text/read.txt");
			InputStreamReader reader = new InputStreamReader(fileInputStream);
			
			int character;
			
			while((character = reader.read() )!= -1 ) {
				System.out.print((char)character);
			};
			reader.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
