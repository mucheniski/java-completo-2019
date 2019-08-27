package capitulo5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeExe;

public class ExercicioLista {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeExe> employees = new ArrayList<>();
		
		System.out.print("How manu employees will be registered? ");
		int n = sc.nextInt();		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Employee #"+i+":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new EmployeeExe(id, name, salary));
			System.out.println();
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		EmployeeExe employeeIncrease = employees.stream().filter(employee -> employee.getId() == idIncrease).findFirst().orElse(null);
		
		if (employeeIncrease != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeeIncrease.increaseSalary(percentage);
		}
		else {
			System.out.print("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (EmployeeExe employeeExe : employees) {
			System.out.println(employeeExe);
		}
		
		sc.close();
		
	}

}
