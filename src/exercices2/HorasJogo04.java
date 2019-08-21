package exercices2;

import java.util.Locale;
import java.util.Scanner;

public class HorasJogo04 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaEntrada, horaSaida, duracao;
		
		horaEntrada = sc.nextInt();
		horaSaida = sc.nextInt();
		
		if (horaEntrada < horaSaida) {
			duracao = horaSaida - horaEntrada;
		}
		else {
			duracao = 24 - horaEntrada + horaSaida;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}

}
