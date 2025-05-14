package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void fileAccess() throws FileNotFoundException{
		FileReader filereader = new FileReader("C:\\Users\\vicky\\eclipse-workspace\\JavaTask7\\src\\exceptions\\test.txt");
	}
	public static void main(String[] args) {
		try {
			FileReader filereader = new FileReader("C:\\Users\\vicky\\eclipse-workspace\\JavaTask7\\src\\exceptions\\test1.txt");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			fileAccess();
		}catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
