package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GileWriterReaderClass {
	public static void main(String[] args) throws IOException {
		File infile = new File("a1.txt"); //declare and create i/p file
		File outfile = new File("FileReaderWriterClass.txt");
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fr = new FileReader(infile);
			int c;
			while((c = fr.read()) != -1)
			{
				System.out.print((char)c);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			fw = new FileWriter(outfile);
			String s= "Java File Handling";
			fw.write(s);
		}
		finally
		{
			fr.close();
			fw.close();
		}
		
	}

}
