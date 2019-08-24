package entities;

public class Student {
	
	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;

	public Double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
}
