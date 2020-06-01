package br.edu.univas.vo;

public class Professor implements Pesquisador {
	
	private String nome;
	private Formacao formacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int calcularConceito() {
		if(formacao == Formacao.ESPECIALISTA){
			return 50;
		}else if (formacao == Formacao.MESTRADO) {
			return 70;
		}else if (formacao == Formacao.DOUTORADO) {
			return 100;
		}
		return 0;
	}
	
	

}
