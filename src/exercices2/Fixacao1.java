package exercices2;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, higher;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			higher = n1;
		}
		else if (n2 > n3) {
			higher = n2;
		}
		else {
			higher = n3;
		}
		
		System.out.println("Higher: " + higher);
		
		sc.close();
		
	}

}
