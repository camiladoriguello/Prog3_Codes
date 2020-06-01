package br.edu.univas.main;

import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main (String [] args) {
		int N1 = 3;
		int N2 = 4;
		
		if(N1 == N2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Iguais");
		}
	}
}
