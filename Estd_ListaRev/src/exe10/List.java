package exe10;

import java.util.ArrayList;
import java.util.Scanner;

import exe10.ExistentValueException;
import exe10.EmptyListException;
import exe10.Node; 

public class List {
	
	private Node primeiro = null, ultimo = null;
	Scanner scanner = new Scanner(System.in);

	public Node getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}

	
	//Insere o valor no inicio 
	public void insere_Inicio(int userId) throws ExistentValueException{						
		Node novo = new Node();			
		if (primeiro == null){
			novo.setUserId(userId);
			setPrimeiro(novo);
		}			
		else{
			novo.setUserId(userId);
			novo.setpProx(primeiro);
			setPrimeiro(novo);				
		}
	}
		
	
	//Imprime a lista 
	public ArrayList<Integer> printLista() throws EmptyListException  {
		ArrayList<Integer> list = new ArrayList<Integer>();		
		if(primeiro == null)
			throw new EmptyListException("A lista esta vazia!");		
		else{
			Node aux = getPrimeiro();			
			while(aux != null){
				int uId = aux.getUserId(); 
				list.add(uId);
				aux = aux.getpProx();
			}
			return list;
		}		
	}
	
	//Remove da lista
	public void removeList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Node aux = getPrimeiro();
		if(primeiro == null) {
			list.remove(aux);
		}else {
			//aux = aux.getpProx();
			System.out.println("O ID " + aux.getUserId() + " foi removido!");
			list.remove(aux);
			this.primeiro = this.primeiro.getpProx();
		}
	}
}





