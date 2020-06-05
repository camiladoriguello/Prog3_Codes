package exe10;

import java.util.ArrayList;
import java.util.Scanner;
import exe10.EmptyListException;
import exe10.ExistentValueException;

public class Main {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		List lista = new List();
		int userId = 0, opt = 0;  
		
		do {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Opçoes: 1-Insrir --- 2-Printar --- 3-Remover --- 9-Encerrar");
			System.out.println("--------------------------------------------------------------------");
			opt = scanner.nextInt();
			
			switch(opt){
            	case 1:
            		System.out.print("ID:");
            		userId = scanner.nextInt();
            		//Insere valore no inicio da lista.
            		try {
            			lista.insere_Inicio(userId);
            		} 
            		catch (ExistentValueException e) {					
            			e.printStackTrace();
            		}
            		break;
            	case 2:
            		ArrayList<Integer> listar = new ArrayList<Integer>();
            		//Recebe os valores da lista em um ArrayList e os imprime.
            		try {
            			listar = lista.printLista();
            		} 
            		catch (EmptyListException e) {
            			e.printStackTrace();					
            		}
            		for(int elemento : listar){
            			System.out.print(elemento + " ");
            		}
            		System.out.println();
            		break;
            	case 3:
            		lista.removeList();
			}
			
		}while(opt != 9);
		
		
	}

}
