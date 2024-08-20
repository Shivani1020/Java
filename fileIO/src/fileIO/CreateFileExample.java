package fileIO;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        // Specify the file name and path
        File file = new File("example.txt");

        try {
            // Check if the file already exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                // Create a new file
                boolean isFileCreated = file.createNewFile();
                
                if (isFileCreated) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("File could not be created.");
                }
            }
        } catch (IOException e) {
            // Handle the potential IOException
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        
        //check whether file exists or not
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        
        //To rename the file
        File newFile = new File("renamed_example.txt");
        
        if (file.exists()) {
            // Attempt to rename the file
            boolean isRenamed = file.renameTo(newFile);

            if (isRenamed) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("File could not be renamed.");
            }
        } else {
            System.out.println("File does not exist.");
        }
        
        //Check if the file exists
        if(file.exists())
        {
        	//Get and display the name of the file
        	System.out.println("File Name: "+file.getName());
        	
        	//Get and display the path of the file
        	System.out.println("File Path: "+file.getPath());
        	
        	//Get and display the absolute path of the file
        	System.out.println("Absolute file path: "+file.getAbsolutePath());
        	
        	//Get and display the parent directory of the file
        	File parentdirectory = file.getParentFile();
        	if(parentdirectory != null)
        	{
        		System.out.println("Parent Directory: "+parentdirectory.getAbsolutePath());
        	}
        	else
        	{
        		System.out.println("The file has no parent directory");
        	}
        }
        else
        {
        	System.out.println("The file does not exist.");
        }
        
        // Check if the file exists before attempting to delete it
        if (file.exists()) {
            // Attempt to delete the file
            boolean isFileDeleted = file.delete();
            
            if (isFileDeleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File could not be deleted.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

