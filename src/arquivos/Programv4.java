package arquivos;

import java.io.File;
import java.util.Scanner;

public class Programv4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder patch: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		//ENCONTRAR APENAS PASTAS
		System.out.println("Folders");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		//ENCONTRAR APENAS ARQUIVOS

		File [] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created succefully: "+ success);
		
		sc.close();
	}
}
