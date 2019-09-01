package entities;

import entities.enums.ShapeColor;

public abstract class Shape {
	
	private ShapeColor color;
	
	public Shape() {}

	public Shape(ShapeColor color) {		
		this.color = color;
	}

	public ShapeColor getColor() {
		return color;
	}

	public void setColor(ShapeColor color) {
		this.color = color;
	}
	
	public abstract double area();

}
