package fileIO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamToWriteIntoMultipleFiles {
	public static void main(String[] args) throws IOException {
		FileOutputStream f1 = new FileOutputStream("file1.txt");
		FileOutputStream f2 = new FileOutputStream("file2.txt");
		ByteArrayOutputStream b1 = new ByteArrayOutputStream();
		b1.write(64);
		b1.writeTo(f1);
		b1.writeTo(f2);
		b1.flush();
	}

}
