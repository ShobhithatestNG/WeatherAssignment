package Utility;

import java.io.File;

public class CreateFolder {

public static String FolderLocation ="";
public static String CreateNewFolder(String DirectoryPath, String FolderName)
{
	//Create Project Directory
	FolderLocation = DirectoryPath +File.separatorChar + FolderName;
	// Create a Directory in the Path
	File file = new File(FolderLocation);
	if(!file.exists())
	{
		file.mkdir();
		System.out.println("Created New Folder at  "+FolderLocation);
	}
	else
	{
		System.out.println("Folder already exists");
	
	}

return FolderLocation;
}
}
