package capitulo5;

import java.util.Locale;
import java.util.Scanner;

public class MatrizesFixacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nLinhas = sc.nextInt();
		int nColunas = sc.nextInt();
		
		int matriz[][] = new int[nLinhas][nColunas];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}			
		}
		
		
		
		int valor = sc.nextInt();		
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
								
				if (matriz[linha][coluna] == valor) {					
					System.out.println("Position: " + linha + "," + coluna + ":");
					
					if (coluna > 0) {
						System.out.println("Left: " + matriz[linha][coluna - 1]);
					}
					
					if (coluna < matriz[linha].length - 1) {
						System.out.println("Right: " + matriz[linha][coluna + 1]);
					}
					
					if (linha > 0) {
						System.out.println("Up: " + matriz[linha - 1][coluna]);
					}
					
					if (linha < matriz.length - 1) {
						System.out.println("Down: " + matriz[linha + 1][coluna]);
					}
					
				}
				
			}
		}
		
		sc.close();
		
	}

}
