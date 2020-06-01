package br.edu.univas.vo;

public abstract class Funcionario {
	
	//----------Atributos----------
	private float salarioBase;
	private float horasTrabalhadas;
	
	public Funcionario(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract float calculaSalario();
	
	//----------Getters and Setters----------
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getHorasTrabalahdas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalahdas(float horasTrabalahdas) {
		this.horasTrabalhadas = horasTrabalahdas;
	}
	
	

}
