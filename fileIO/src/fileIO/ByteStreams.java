package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	public static void main(String[] args) {
        String filePathout = "output.dat"; // Path to the binary file
        String content = "Hello, World!"; // Content to write to the file
        
        String filePathin = "input.dat"; // Path to the binary file

        try (FileInputStream fis = new FileInputStream(filePathin)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Assuming the file contains text, for demonstration
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream(filePathout)) {
            fos.write(content.getBytes()); // Convert string to bytes and write to file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}