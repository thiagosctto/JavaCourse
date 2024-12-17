package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramV3 {
	public static void main(String[] args) {
		String[] lines = new String[] {"pao","galinha", "fds" };
		
		String patch = "C:\\Users\\55499\\Desktop\\CursoDeJava\\out.txt";
		
		try (BufferedWriter bw =  new BufferedWriter(new FileWriter(patch, true))){
			for (String line : lines ) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
