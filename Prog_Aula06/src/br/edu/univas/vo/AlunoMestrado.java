package br.edu.univas.vo;
import java.util.ArrayList;

public class AlunoMestrado implements Aluno{

	@Override
	public boolean isAprovado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private ArrayList<Character> notas = new ArrayList<>();

	public ArrayList<Character> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Character> notas) {
		this.notas = notas;
	}
	
	
	
}
