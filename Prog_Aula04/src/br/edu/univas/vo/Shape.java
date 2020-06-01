package br.edu.univas.vo;

public abstract class Shape {

	//----------Shape class attribute----------
	private String color;
	
	//----------Shape class methods----------
	public abstract double area();
	public abstract String toString();

	//----------Shape class getters and setters---------- 
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
