package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
	public static void main(String[] args) throws IOException {
		 FileInputStream in = null;
	      FileOutputStream out = null;
		try {
			in = new FileInputStream("Input1.txt");
			out = new FileOutputStream("Output1.txt");
			
			int c;
			while((c = in.read()) != -1)
			{
				out.write(c);
			}
			System.out.println();
		} 
		finally {
			if(in!=null)
			{
				in.close();
			}
			if(out!= null)
			{
				out.close();
			}
			
		}
		
	}

}
