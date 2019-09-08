package capitulo14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {
		
		String pathIn = "//home//mucheniski//Documents//JavaCompleto2019//files//votes.csv";
		
		Map<String, Integer> votes = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
			
			String line = br.readLine();			
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				Integer count = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, votesSoFar + count);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine(); // Ler a próxima linha
				
			}			
			
			for (String candidate : votes.keySet()) {
				System.out.println(candidate + ": " + votes.get(candidate));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}
	
}
