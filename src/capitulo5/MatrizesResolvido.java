package capitulo5;

import java.util.Locale;
import java.util.Scanner;

public class MatrizesResolvido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		int matriz[][] = new int[n][n];
		
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
				int valor = sc.nextInt();
				
				matriz[linha][coluna] = valor;
				
				if (valor < 0) {
					count++;
				}			
				
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println("Negative numbers = " + count);
		
		sc.close();
		
	}
	
}
