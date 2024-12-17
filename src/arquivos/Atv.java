package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		new ArrayList<>();
		
		System.out.println("enter file path: ");
		String path = sc.nextLine();
		
		File sourceFile = new File(path);
		String sourceFolder = sourceFile.getPath();
		
		new File(sourceFolder + "\\out").mkdir();
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				System.out.println(itemCsv);
				itemCsv = br.readLine();
			}
			
		}catch (IOException e){
			System.out.println("Error writing file: "+e.getMessage());
		}
		
		
		sc.close();
	}
}
