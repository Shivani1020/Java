package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;

class Employee implements Serializable{
	private static final long serialversionUID = 1L;
	String name;
	int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id= id;
	}
}

public class SerializationDeserialization {
	public static void main(String[] arg) {
		Employee emp = new Employee("Jhon", 900);
		
		try {
			FileOutputStream fileout = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(emp);
			
			fileout.close();
			out.close();
			System.out.println("Object saved in file...");
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
			
	}

}
