package br.edu.univas.main;

import br.edu.univas.vo.*;

public class StartApp {
	
	public static void main(String [] args) {
		Gerente gerente1 = new Gerente();
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(001);
		cliente1.setNome("Camila Doriguello Moreira");
		
		ContaPoupanca conta1 = new ContaPoupanca(99999, cliente1, 1, 0);
		gerente1.addConta(conta1);
		conta1.depositar(1000);
		conta1.depositar(2000);
		conta1.sacar(400);
		System.out.println(conta1.getSaldo());
		
	}

}
