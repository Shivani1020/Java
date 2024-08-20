package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream infile = null;
		FileOutputStream ofile = null;
		
		try
		{
			infile = new FileInputStream("a1.txt");
			int b;
			while((b = infile.read()) != -1)
			{
				System.out.print((char)b);
			}
			infile.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			infile = new FileInputStream("a1.txt");
			ofile =new FileOutputStream("a2.txt");
			int b;
			while((b = infile.read())!= -1)
			{
				ofile.write(b);
				//System.out.print((char)b);
			}
			ofile.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}
