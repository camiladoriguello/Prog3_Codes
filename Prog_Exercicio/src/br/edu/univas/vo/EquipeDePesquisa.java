package br.edu.univas.vo;

import java.util.ArrayList;

public class EquipeDePesquisa {
	
	private ArrayList<Pesquisador> membros = new ArrayList<>();
	
	public ArrayList<Pesquisador> getMembros() {
		return membros;
	}

	public void addMembro(Pesquisador pesquisador) {
		membros.add(pesquisador);
	}
	
	public int calcularConceitoGeral() {
		int soma = 0;
		
		for (Pesquisador pesquisador: membros) {
			soma += pesquisador.calcularConceito();
		}
		return soma;
	}
	
	public void setMembros(ArrayList<Pesquisador> membros) {
		this.membros = membros;
	}

	
	
	

}
