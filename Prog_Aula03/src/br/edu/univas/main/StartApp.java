package br.edu.univas.main;

import br.edu.univas.vo.Cat;
import br.edu.univas.vo.Dog;

import java.util.ArrayList;


public class StartApp {
	
	public static void main (String [] args) {
		ArrayList animals = new ArrayList();
		
		Cat cat1 = new Cat("Siamês");
		System.out.println(cat1.emitsSound());
		cat1.eat();
		cat1.setWeight(2.23f);
		
		System.out.println("-------------------------");
		
		Dog dog1 = new Dog("Pug");
		System.out.println(cat1.emitsSound());
		dog1.eat();
		dog1.setWeight(2.23f);
	}
}
