package entities;

public class Rectangle {
	
	public Double width;
	public Double height;
	
	public Double area() {
		return (width * height) / 2; // Inserir a formula correta
	}
	
	public Double perimeter() {
		return Math.pow(width, 3.0); // Inserir a formula correta
	}
	
	public Double diagonal() {
		return width * height; // Inserir a formula correta
	}
	
}
