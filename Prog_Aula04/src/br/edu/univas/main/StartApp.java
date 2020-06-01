package br.edu.univas.main;
import br.edu.univas.vo.*;

public class StartApp {

	public static void main (String [] args) {
		
		Circle circle1 = new Circle();
		circle1.setRadius(5);
		circle1.setColor("Red");
		System.out.println(circle1.toString());
		System.out.println("Área: " + circle1.area());
		
		System.out.println("---------------------------------------------");
			
		Rectangle retangle1 = new Rectangle();
		retangle1.setLength(4);
		retangle1.setWidth(3);
		retangle1.setColor("Green");
		System.out.println(retangle1.toString());
		System.out.println("Área: " + retangle1.area());

		
		
		
	}
}
