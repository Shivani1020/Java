package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReadWrite {
	public static void main(String[] args) throws IOException {
		String[] names = {"Shivani", "Supriya", "Shreyas", "Sudu", "Shivu"};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\fileIO\\Output.txt"));
			//BufferedWriter output = new BufferedWriter(new fileWrite("Output.txt"));			
			writer.write("Writing First Line");
			writer.newLine();
			writer.write("Writing Second Line");
			for(String name:names)
			{
				//System.out.println(name);
				writer.write("\n"+name);
			}
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
			String line;
			while((line=reader.readLine()) != null)
			{
				System.out.println(line);
			}
			reader.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
