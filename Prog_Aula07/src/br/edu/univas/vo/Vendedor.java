package br.edu.univas.vo;

public class Vendedor extends Funcionario {
	
	private float comissao;

	public Vendedor(float salarioBase) {
		super(salarioBase);
		this.comissao = comissao;
	}
	
	@Override
	public float calculaSalario() {
		return getSalarioBase() + (getSalarioBase() * comissao / 100);
	}
	
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}


	
}
