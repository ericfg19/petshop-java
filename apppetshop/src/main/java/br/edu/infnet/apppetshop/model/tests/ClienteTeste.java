package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Cliente;

public class ClienteTeste {
		
public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Hurley", "048151623-42", "teste@teste.com", "Shih-Tzu");
		System.out.println(cliente);
	}
	
}
