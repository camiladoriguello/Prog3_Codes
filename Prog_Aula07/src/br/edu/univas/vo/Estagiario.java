package br.edu.univas.vo;

public class Estagiario extends Funcionario {
	
	private float valorHora; 

	public Estagiario(float salarioBase, float valorHora) {
		super(salarioBase);
		this.valorHora = valorHora;
		
	}
	
	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public float valorHora() {
		return valorHora * getHorasTrabalahdas();
	}
	
	public void setValorHora(float valorHora){
		this.valorHora = valorHora;
	}

	
}
