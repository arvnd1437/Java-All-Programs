package FileHandling;

import java.io.File;

public class FileOperation {

	public static void main(String[] args) {
		/*//To Create empty Folder
		//File f = new File ("//home//arvnd//eclipse-workspace//File//ara");
		//f.mkdir();
		//System.out.println("Folder Created It's Done");*/
		
		/*//To list a folder
		File f = new File ("//home//arvnd/Downloads//");
		File fi[]=f.listFiles();
		for(File i:fi)
		{
		//	System.out.println(i);
			System.out.println(i.isFile());
		}*/
		
	
		File f = new File ("//home//arvnd//eclipse-workspace//File//ara//ara.java");
		
		f.canWrite();
		{
		
			System.out.println("Done");
		}
		
		

	}

}
