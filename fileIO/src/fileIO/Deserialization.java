package fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		Employee emp = null;
		try {
			FileInputStream filein = new FileInputStream("Employee.txt");
			ObjectInputStream in = new ObjectInputStream(filein);
			emp = (Employee)filein.readObject();
			System.out.println("Name: "+emp.name);
			System.out.println("Id: "+emp.id);
			filein.close();
			in.close();
			System.out.println();
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());	
		}
		
	}

}
