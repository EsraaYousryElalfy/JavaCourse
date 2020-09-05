package JavaCourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionClass {
	File file;
	
	public void arrayException() {
		try	{
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index not found");
		}
	}
	
	public void readFile() throws FileNotFoundException	{
		file=new File("C://file.txt");
	}
	
	public static void main(String[] args) {
		exceptionClass exc = new exceptionClass();
		try
		{
		exc.readFile();
		FileReader fReader = new FileReader(exc.file);
		fReader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch (IOException e)
		{
			System.out.println("Close error");
		}
		exc.arrayException();
	}
}
