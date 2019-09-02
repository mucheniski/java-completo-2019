package capitulo11;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraDeArquivo {
	
	public static void main(String[] args) {
		
		String path = "//home//mucheniski//Documents//JavaCompleto2019//input.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
