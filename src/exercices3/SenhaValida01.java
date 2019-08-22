package exercices3;

import java.util.Locale;
import java.util.Scanner;

public class SenhaValida01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta=2002, campoSenha;
		
		campoSenha = sc.nextInt();
		
		while (campoSenha != senhaCorreta) {
			System.out.print("Senha invalida");
			campoSenha = sc.nextInt();
		}
 		
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
