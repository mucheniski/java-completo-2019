package capitulo14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> students = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int studentsA = sc.nextInt();
		
		for (int i = 0; i < studentsA; i++) {
			students.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		int studentsB = sc.nextInt();
		
		for (int i = 0; i < studentsB; i++) {
			students.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int studentsC = sc.nextInt();
		
		for (int i = 0; i < studentsC; i++) {
			students.add(sc.nextInt());
		}
		
		System.out.print("Total students: " + students.size());
		
		
		sc.close();
		
	}

}
