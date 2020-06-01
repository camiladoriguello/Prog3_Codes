package br.edu.univas.vo;
import br.edu.univas.vo.Shape;

public class Circle extends Shape {

	//----------Circle attributes---------- 
	private double radius;
	
	//----------Circle methods----------
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2) ;
	}

	@Override
	public String toString() {
		return "Eu sou um Circulo! \n" +
			   "Cor: " + this.getColor() +
			   "\nRaio: " + this.getRadius();
	}

	//----------Circle Getters and Setters----------
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
