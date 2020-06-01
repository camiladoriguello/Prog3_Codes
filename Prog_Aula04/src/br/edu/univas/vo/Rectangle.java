package br.edu.univas.vo;
import br.edu.univas.vo.Shape;

public class Rectangle extends Shape {
	
	//----------Rectangle attributes----------
	private double length;
	private double width;
	
	//----------Rectangle methods----------
	@Override
	public double area() {
		return width * length;
	}
	@Override
	public String toString() {
		return "Eu sou um retângulo! \n" +
			   "Cor: " + this.getColor() +
			   "\nLargura: " + this.getWidth() +
			   "\nAltura: " + this.getLength();
	}
	
	//----------Rectangle getters and setters----------
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	

	
}
