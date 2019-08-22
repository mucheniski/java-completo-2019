package exercices4;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, in=0, out=0;
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int value = sc.nextInt();
			
			if (value < 10 || value > 20) {
				out++;
			}
			else {
				in++;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
 		
		sc.close();
		
	}


}
