package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Hospedagem;

public class HospedagemTeste {
	
	public static void main(String[] args) {
		
		Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199, 456);
		hospedagem.setDiaria(2);
		hospedagem.setGrande(false);
		hospedagem.setCuidados("Animal não possui uma pata");
		
		System.out.println("Valor = " +hospedagem.calcularServico());
	}

}
