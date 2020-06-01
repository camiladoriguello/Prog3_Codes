package br.edu.univas.vo;

public abstract class  Animal {
	
	//----------Animal class attributes----------
	private String breed;
	private float weight;
	
	//---------- Animal Methods----------
	public abstract String emitsSound();
	public void eat() {
		System.out.println("Comendo...");
	}
	
	//----------Animal getters and setters--------- 
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
