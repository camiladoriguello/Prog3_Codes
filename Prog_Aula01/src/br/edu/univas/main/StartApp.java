package br.edu.univas.main;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Book;
import br.edu.univas.vo.Author;

public class StartApp {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		ArrayList bookList = new ArrayList();
		int option = 0;
		
		do {
			 
			System.out.println("****CADASTRO DE CONTAS****");
			System.out.println("1 - Cadastrar ");
			System.out.println("2 - Listar ");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				// register	
				// the variable xBk is the "same" variable NEWBOOK created in method registerBook
				Book xBk = registerBook(scanner);
				bookList.add(xBk); //inserção do abjeto BOOK no array BOOKLIST	 
			
			}else if (option == 2) {
				for (int i = 0; i < bookList.size(); i++) {
					Book anotherVarBook = (Book) bookList.get(i); 
					Author anotherVarAut = anotherVarBook.getAuthor();
					
					System.out.println("Título            : " + anotherVarBook.getTitle());
					System.out.println("Idioma            : " + anotherVarBook.getLanguage());
					System.out.println("Data de Publicação: " + anotherVarBook.getDatePub());
				}
			}	
			
		}while(option != 9);
		scanner.close();
		
		
	}

	private static Book registerBook(Scanner scanner) {
		Book newBook = new Book();
		System.out.println("Título: ");
		newBook.setTitle(scanner.nextLine());
		System.out.println("Idioma: ");
		newBook.setLanguage(scanner.nextLine());
		System.out.println("Data de Publicação: ");
		newBook.setDatePub(scanner.nextLine());
		
		Author newAuthor = new Author();
		System.out.println("Nome do autor: ");
		newAuthor.setName(scanner.nextLine());
		System.out.println("Sobrenome do autor: ");
		newAuthor.setSurname(scanner.nextLine());
		System.out.println("Site do autor: ");
		newAuthor.setSite(scanner.nextLine());
		
		
		return newBook; 
	}
}
 