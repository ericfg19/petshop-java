package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Higiene;

public class HigieneTeste {

	public static void main(String[] args) {
		
		Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
		higiene.setQuantidade(1);
		higiene.setUnhas(true);
		higiene.setDetalhes("Ter cuidado ao limpar a orelha");
		
		System.out.println("Valor = " +higiene.calcularServico());
	}
}
