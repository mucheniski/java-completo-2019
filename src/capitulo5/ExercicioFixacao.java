package capitulo5;

import java.util.Locale;
import java.util.Scanner;

import entities.GuestStudent;

public class ExercicioFixacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		GuestStudent[] vectStudents = new GuestStudent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");			
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			vectStudents[room] = new GuestStudent(name, email);
			
		}
		
		System.out.println("Busy rooms:");
		
		for (int i=0; i<vectStudents.length; i++) {
			
			if (vectStudents[i] != null) {
				System.out.println(i + ": " + vectStudents[i]);
			}
			
		}
		
		sc.close();
		
	}
	
}
