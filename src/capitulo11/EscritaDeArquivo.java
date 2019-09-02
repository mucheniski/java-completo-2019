package capitulo11;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscritaDeArquivo {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night" };
		
		String path = "//home//mucheniski//Documents//JavaCompleto2019//output.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // Acrescentando o true o arquivo nao é reescrito e sim acrescentado
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // Quebra de linha
			}
			
		} catch (Exception e) {
			e.printStackTrace();			
		}

	}

}
