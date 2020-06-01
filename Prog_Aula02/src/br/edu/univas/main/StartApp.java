package br.edu.univas.main;

import br.edu.univas.vo.*;
import java.util.Scanner;
import java.util.ArrayList;


public class StartApp {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList bikesList = new ArrayList();
		int option = 0;
		
		do {
			
			System.out.println("::::1 CADASTRA - 2 LISTA - 9 SAIR::::");
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) { 
				Bike xBike = registerBike(scanner);
				bikesList.add(xBike);
			}else if (option == 2) {
				listBikes(bikesList);
			}else if (option != 9) {
				System.out.println("Opção incorreta!");
			}
		}while(option != 9);
	}
	
	private static Bike registerBike (Scanner scanner) {
		Bike newBike = new Bike();
		System.out.println("Marca: ");
		newBike.setMark(scanner.nextLine());
		System.out.println("Cor: ");
		newBike.setColor(scanner.nextLine());
		System.out.println("Preço: ");
		newBike.setPrice(scanner.nextInt());
		
		Tire newTire = new Tire();
		System.out.println("Marca do Pneu:");
		newTire.setMarkT(scanner.nextLine());
		scanner.nextLine();
		System.out.println("Calibre do pneu:");
		newTire.setCalib(scanner.nextInt());
		
		return newBike;
	}
	
	private static void listBikes (ArrayList bikesList) {
		for (int i = 0; i < bikesList.size(); i++) {
			Bike bike = (Bike) bikesList.get(i);
			System.out.println("Marca: " + bike.getMark());
			System.out.println("Cor: " + bike.getColor());
			System.out.println("Preço: " + bike.getPrice());
			System.out.println("Pneu: " + bike.getTire().getMarkT());
			System.out.println("Calibre: " + bike.getTire().getCalib());
		}
	}
}


