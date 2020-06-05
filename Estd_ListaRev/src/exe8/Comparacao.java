package exe8;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparacao {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int valor = -1;
		ArrayList F1 = new ArrayList();
		ArrayList F2 = new ArrayList();

		System.out.println("Preencha o array F1 e digite 0 para parar!");
		do {
			valor = scanner.nextInt();
			if (valor != 0) {
				F1.add(valor);
			}
		}while(valor != 0);
		
		System.out.println("Preencha o array F2 e digite 0 para parar!");
		do {
			valor = scanner.nextInt();
			if (valor != 0) {
				F2.add(valor);
			}
		}while(valor != 0);
		
		maiorLista(F1, F2);
		
	}	
	
	public static void maiorLista (ArrayList F1, ArrayList F2) {
		if (F1.size() > F2.size()) {
			System.out.println("F1 é a maior lista!");
		}
		else if(F2.size() > F1.size()) {
			System.out.println("F2 é a maior lista!");
		}else {
			System.out.println("As listas são de tamanhos iguais!");
		}	
	}
}
