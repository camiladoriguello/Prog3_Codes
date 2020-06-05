package exe9;

import java.util.ArrayList;
import java.util.Scanner;

public class Circular {
	//Implementar uma lista circular e que não permita ao usuário apagar o ultimo elemento da lista, ou seja, 
	//ela nunca deverá ficar vazia
	//Ultimo elemento = único elemento restante 
	
	public static void main (String [] args) {
	
		//Declaração de variáveis do sistema
		Scanner scanner = new Scanner(System.in);
		ArrayList array = new ArrayList();
		
		int pont = 0;
		int opc = -1; 
		int val; 
		System.out.print("Tamanho do vetor: "); int tam = scanner.nextInt();
		
		while (opc != 0) {
			val = -1;
			System.out.println("---------- 1 Inserir - 2 Remover - 0 Encerrar ----------");
			System.out.print("Opção: ");opc = scanner.nextInt();
			
			//Inserção
			if (opc == 1) {
				while(val != 0) {
					val = scanner.nextInt();
					if (val != 0) {
						if (array.size() < tam) {
							pont = array.size();
							array.add(val);
						}else {
							pont++;
							if (pont >= tam) {
								pont = 0;
							}
							array.set(pont ,val);
						}
					}
				}				//impressão
				System.out.println("( Tam: " + array.size() + ") " + array);
			}
			
			if (opc == 2) {
				//remoção
				if(array.size() > 1) {
					array.remove(array.size()-1);
					System.out.println("( Tam: " + array.size() + ") " + array);
				}else {
					System.out.println("Array com apenas uma posição, impossível excluir!");
				}
			}
		}
		
		scanner.close();
	}
}
