package br.edu.univas.vo;

public class Cat extends Mamifero{

	//----------Cat Constructor----------
	public Cat(String breed) {
		super(); //mother class construction 
		this.setBreed(breed);
	}
	
	//----------Cat Method----------
	@Override
	public String emitsSound() {
		return "MIAU";
	}

}
