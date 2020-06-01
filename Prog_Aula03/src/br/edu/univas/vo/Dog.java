package br.edu.univas.vo;

public class Dog extends Mamifero{

	//----------Dog Constructor----------
	public Dog(String breed) {
		super(); //mother class construction 
		this.setBreed(breed);
	}
	
	//----------Dog Method----------
	@Override
	public String emitsSound() {
		return "AU AU";
	}

}
