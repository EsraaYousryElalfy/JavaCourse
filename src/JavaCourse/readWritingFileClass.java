package JavaCourse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readWritingFileClass {
	public static void main(String[] args) {
		File file=new File("file.txt");
		try	{
			file.createNewFile();
			FileWriter fWriter=new FileWriter(file);
			BufferedWriter bWriter=new BufferedWriter(fWriter);
			bWriter.write("Java Course for selenium webdriver");
			bWriter.write(" 1.OOP Princples,");
			bWriter.write(" 2.Array types,");
			bWriter.write(" 3.Constractor types, and");
			bWriter.write(" 4.Finish course");
			bWriter.flush();
			bWriter.close();
			FileReader fReader=new FileReader(file);
			BufferedReader bReader=new BufferedReader(fReader);
			String line=bReader.readLine();
			while(line!=null)	{
				System.out.println(line);
				break;
			}
			bReader.close();
			if(file.delete())
			{
				System.out.println("Deleted the file "+file.getName());
			}
			else
			{
				System.out.println("Failed to delete the file.");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
