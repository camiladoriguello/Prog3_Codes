package exe7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		ArrayList<Inimigo> listaInimigos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int option = -1;
		
		System.out.println("SEUS PONTOS DE VIDA: ");
		
		//----------Menu Options----------
		do {
			int value = 1;
			int pos = 0;
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Op�oes: 1-Criar novo inimigo --- 2-Matar --- 3-Listar --- 0-Encerrar");
			System.out.println("--------------------------------------------------------------------");
			
			option = scanner.nextInt();
			
			if(option == 1) {
				if (listaInimigos.size() < 20) {
					Inimigo novoInimigo = criarNovo(scanner);
					listaInimigos.add(novoInimigo);
					
					Collections.sort(listaInimigos, new Comparator<Inimigo>() {
			            @Override 
			            public int compare(Inimigo tempIni1, Inimigo tempIni2) {
			                return tempIni1.getDificuldade() - tempIni2.getDificuldade(); // Ascending
			            }
			        });
					
				}else {
					System.out.println("N�o h� como adicionar mais inimigos!");
				}
			}	
			else if(option == 2) {
				matarInimigo(scanner, listaInimigos);
			}
			else if(option == 3) {
				listarInimigos(listaInimigos);
		    } 
			else if(option != 0) {
				System.out.println("Op��o inv�lida!");
			}
		    } while (option != 0);
		    System.out.println("FIM");
		    
		
	}
	
	
	
	//----------Method 1----------
	public static Inimigo criarNovo(Scanner scanner) {
		Inimigo newInimigo = new Inimigo();
		System.out.println("Qual o novo inimigo a ser inserido no Jogo? ");
		System.out.print("Nome:"); newInimigo.setNome(scanner.next());
		scanner.nextLine();
		System.out.print("Dificuldade: "); newInimigo.setDificuldade(scanner.nextInt());
		return newInimigo;
	}
	
	//----------Method 2----------
	public static void matarInimigo(Scanner scanner, ArrayList listaInimigos) {
		System.out.println("Informe a posi��o do inimigo que deseja matar!");
		int posicao = scanner.nextInt();
		Inimigo inimigo = (Inimigo) listaInimigos.get(posicao);
		listaInimigos.remove(posicao);
		System.out.println("Voc� acabou de matar " + inimigo.getNome() + "!!!");
	}
	
	//----------Method 3----------
	public static void listarInimigos(ArrayList listaInimigos) {
		for (int i = 0; i < listaInimigos.size(); i++) {
			
			Inimigo inimigo = (Inimigo) listaInimigos.get(i);
			//if (inimigo.getDificuldade(i) > inimigo.getDificuldade(j)) {
				//int aux = inimigo.getDificuldade(i);
                //inimigo.setDificuldade(i) = inimigo.getDificuldade(j);
			    //inimigo.setDificuldade(i) = aux;
			//}
				
			System.out.print("Nome: " + inimigo.getNome());
			System.out.print(" - Dificuldade: " + inimigo.getDificuldade());
			System.out.println("\n");
			
		}
	}
}
